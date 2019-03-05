package br.com.bestbrewer.persistence.dao

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import br.com.bestbrewer.persistence.entity.Word

@Dao
interface WordDao {

    @Query("SELECT * FROM word_table ORDER BY word ASC")
    fun getAllWords(): LiveData<List<Word>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(word: Word)

    @Query("DELETE FROM word_table")
    fun deleteAll()
}