package br.com.bestbrewer.persistence.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import br.com.bestbrewer.persistence.entity.ReceitaLupulo

@Dao
interface ReceitaLupuloDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(receitaLupulo: ReceitaLupulo)

}