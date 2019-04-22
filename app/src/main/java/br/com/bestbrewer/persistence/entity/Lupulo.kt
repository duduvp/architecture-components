package br.com.bestbrewer.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "lupulo")
data class Lupulo(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "nome") val nome: String,
    @ColumnInfo(name = "teor_alcoolico") val teorAlcoolico: String,
    @ColumnInfo(name = "lote") val lote: String,
    @ColumnInfo(name = "cadastro") val cadastro: Date = Date(),
    @ColumnInfo(name = "status") val status: Boolean = true
)