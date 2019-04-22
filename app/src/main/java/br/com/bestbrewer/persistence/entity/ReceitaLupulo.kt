package br.com.bestbrewer.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "receita_lupulo",
    foreignKeys = [ForeignKey(
        entity = Lupulo::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("lupulo_id"),
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.NO_ACTION
    ), ForeignKey(
        entity = Receita::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("receita_id"),
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.NO_ACTION
    )]
)
data class ReceitaLupulo(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @ColumnInfo(name = "lupulo_id") val lupuloId: Long,
    @ColumnInfo(name = "receita_id") val receitaId: Long,
    @ColumnInfo(name = "unidade_medida_id") val unidadeMedidaId: Long,
    @ColumnInfo(name = "quantidade") val quantidade: Double,
    @ColumnInfo(name = "tempo_fervura") val tempoFervura: Int,
    @ColumnInfo(name = "tempo_fervura_noventa") val tempoFervuraNoventa: Int,
    @ColumnInfo(name = "numero_lote") val numeroLote: String

)