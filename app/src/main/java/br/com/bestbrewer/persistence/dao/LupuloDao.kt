package br.com.bestbrewer.persistence.dao

import androidx.room.*
import br.com.bestbrewer.persistence.entity.Lupulo

@Dao
interface LupuloDao {

    @Delete
    fun delete(lupulo: Lupulo)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(lupulo: Lupulo)

    @Query("SELECT * FROM lupulo WHERE id = :id")
    fun query(id: Long): Lupulo

    @Query("SELECT * FROM lupulo WHERE status = :status ORDER BY nome ASC")
    fun queryAll(status: Boolean): List<Lupulo>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(lupulo: Lupulo)

}