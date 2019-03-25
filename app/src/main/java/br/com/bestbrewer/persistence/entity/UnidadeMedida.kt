package br.com.bestbrewer.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "unidade_medida")
data class UnidadeMedida(
    @PrimaryKey @ColumnInfo(name = "id") var id: Long,
    @ColumnInfo(name = "descricao") var descricao: String,
    @ColumnInfo(name = "status") var status: Boolean
)