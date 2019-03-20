package br.com.bestbrewer.persistence.dao

import androidx.room.*
import br.com.bestbrewer.persistence.entity.Receita

@Dao
interface ReceitaDao {

    @Delete
    fun delete(receita: Receita)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(receita: Receita)

    @Query("SELECT * FROM receita WHERE id = :id")
    fun query(id: Long): Receita

    @Query("SELECT * FROM receita WHERE status = :status ORDER BY nome ASC")
    fun queryAll(status: Boolean): List<Receita>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(receita: Receita)

}