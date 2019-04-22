package br.com.bestbrewer.persistence.entity

import androidx.room.*
import java.util.*

@Entity(tableName = "receita")
data class Receita(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "numero") val numero: Int,
    @ColumnInfo(name = "versao") val versao: Int,
    @ColumnInfo(name = "nome") val nome: String,
    @ColumnInfo(name = "receita") val receita: String,
    @ColumnInfo(name = "descricao") val descricao: String,
    @ColumnInfo(name = "producao") val producao: Date, //BREW DATE
    @ColumnInfo(name = "lote") val lote: Int, //LOT NUMBER
    @ColumnInfo(name = "fermentador") val fermentador: String, //FV
    @ColumnInfo(name = "moagem") val moagem: Date, //MILL DATE
    @ColumnInfo(name = "ph_agua_quente") val phAguaQuente: Double, //ph HLT
    @ColumnInfo(name = "ph_agua_fria") val phAguaFria: Double, //pH CLT
    @ColumnInfo(name = "cadastro") val cadastro: Date = Date(),
    @ColumnInfo(name = "status") val status: Boolean
)