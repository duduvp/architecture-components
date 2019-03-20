package br.com.bestbrewer.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import androidx.sqlite.db.SupportSQLiteDatabase
import br.com.bestbrewer.persistence.converter.DateConverter
import br.com.bestbrewer.persistence.entity.old.WordEntity
import br.com.bestbrewer.persistence.dao.WordDao
import br.com.bestbrewer.persistence.entity.Receita
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Database(entities = [WordEntity::class, Receita::class], version = 1)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun wordDao(): WordDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context, scope: CoroutineScope): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).addCallback(AppDatabaseCallback(scope)).build()
                INSTANCE = instance
                return instance
            }
        }
    }

    private class AppDatabaseCallback(private val scope: CoroutineScope) : RoomDatabase.Callback() {
        override fun onOpen(db: SupportSQLiteDatabase) {
            super.onOpen(db)
            INSTANCE?.let { database ->
                scope.launch(Dispatchers.IO) {
                    populateDatabase(database.wordDao())
                }
            }
        }

        fun populateDatabase(wordDao: WordDao) {
            wordDao.deleteAll()

            var word = WordEntity("Hello")
            wordDao.insert(word)
            word = WordEntity("World!")
            wordDao.insert(word)
        }
    }
}