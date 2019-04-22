package br.com.bestbrewer.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "unidade_medida")
data class UnidadeMedida(
    @PrimaryKey @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "descricao") val descricao: String,
    @ColumnInfo(name = "status") val status: Boolean
)