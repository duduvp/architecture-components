package br.com.bestbrewer.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import br.com.bestbrewer.persistence.entity.ReceitaGrao

@Dao
interface ReceitaGraoDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(receitaGrao: ReceitaGrao)
}