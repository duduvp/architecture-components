package br.com.bestbrewer.persistence

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import br.com.bestbrewer.persistence.converter.DateConverter
import br.com.bestbrewer.persistence.dao.*
import br.com.bestbrewer.persistence.entity.*

@Database(
    entities = [Grao::class, Lupulo::class, Receita::class, ReceitaGrao::class, ReceitaLupulo::class],
    version = 1
)
@TypeConverters(DateConverter::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun graoDao(): GraoDao
    abstract fun lupuloDao(): LupuloDao
    abstract fun receitaDao(): ReceitaDao
    abstract fun receitaGraoDao(): ReceitaGraoDao
    abstract fun receitaLupuloDao(): ReceitaLupuloDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}