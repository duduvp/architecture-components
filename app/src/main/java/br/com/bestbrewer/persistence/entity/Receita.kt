package br.com.bestbrewer.persistence.entity

import androidx.room.*
import java.util.*

@Entity(tableName = "receita")
data class Receita(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Long,
    @ColumnInfo(name = "numero") var numero: Int,
    @ColumnInfo(name = "versao") var versao: Int,
    @ColumnInfo(name = "nome") var nome: String,
    @ColumnInfo(name = "receita") var receita: String,
    @ColumnInfo(name = "descricao") var descricao: String,
    @ColumnInfo(name = "producao") var producao: Date, //BREW DATE
    @ColumnInfo(name = "lote") var lote: Int, //LOT NUMBER
    @ColumnInfo(name = "fermentador") var fermentador: String, //FV
    @ColumnInfo(name = "moagem") var moagem: Date, //MILL DATE
    @ColumnInfo(name = "ph_agua_quente") var phAguaQuente: Double, //ph HLT
    @ColumnInfo(name = "ph_agua_fria") var phAguaFria: Double, //pH CLT
    @ColumnInfo(name = "cadastro") var cadastro: Date = Date(),
    @ColumnInfo(name = "status") var status: Boolean
)