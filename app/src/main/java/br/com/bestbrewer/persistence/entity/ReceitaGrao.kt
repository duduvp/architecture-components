package br.com.bestbrewer.persistence.entity

import androidx.room.*

@Entity(
    tableName = "receita_grao",
    foreignKeys = [ForeignKey(
        entity = UnidadeMedida::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("unidade_medida_id"),
        onUpdate = ForeignKey.CASCADE,
        onDelete = ForeignKey.NO_ACTION
    )]
)
data class ReceitaGrao(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Long,
    @Embedded val receita: Receita,
    @Relation(parentColumn = "id", entityColumn = "receitaId", entity = Grao::class) val graoList: List<Grao>,
    @ColumnInfo(name = "quantidade") val quantidade: Double,
    @ColumnInfo(name = "numero_lote") val numeroLote: String
)
