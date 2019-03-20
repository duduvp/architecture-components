package br.com.bestbrewer.persistence.dao

import androidx.room.*
import br.com.bestbrewer.persistence.entity.Grao

@Dao
interface GraoDao {

    @Delete
    fun delete(grao: Grao)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(grao: Grao)

    @Query("SELECT * FROM grao WHERE id = :id")
    fun query(id: Long): Grao

    @Query("SELECT * FROM grao WHERE status = :status ORDER BY nome ASC")
    fun queryAll(status: Boolean): List<Grao>

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(grao: Grao)

}