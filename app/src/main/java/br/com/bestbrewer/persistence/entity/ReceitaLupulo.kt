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
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Long,
    @ColumnInfo(name = "lupulo_id") var lupuloId: Long,
    @ColumnInfo(name = "receita_id") var receitaId: Long,
    @ColumnInfo(name = "unidade_medida_id") var unidadeMedidaId: Long,
    @ColumnInfo(name = "quantidade") var quantidade: Double,
    @ColumnInfo(name = "tempo_fervura") var tempoFervura: Int,
    @ColumnInfo(name = "tempo_fervura_noventa") var tempoFervuraNoventa: Int,
    @ColumnInfo(name = "numero_lote") var numeroLote: String

)