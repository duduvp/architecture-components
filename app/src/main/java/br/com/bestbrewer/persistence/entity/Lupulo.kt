package br.com.bestbrewer.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity(tableName = "lupulo")
data class Lupulo(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Long,
    @ColumnInfo(name = "nome") var nome: String,
    @ColumnInfo(name = "teor_alcoolico") var teorAlcoolico: String,
    @ColumnInfo(name = "lote") var lote: String,
    @ColumnInfo(name = "cadastro") var cadastro: Date = Date(),
    @ColumnInfo(name = "status") var status: Boolean = true
)