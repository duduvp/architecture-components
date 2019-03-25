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
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Long,
    @Embedded var receita: Receita,
    @Relation(parentColumn = "id", entityColumn = "receitaId", entity = Grao::class) var graoList: List<Grao>,
    @Relation(parentColumn = "id", entityColumn = "receitaId", entity = Grao::class) var graoList: List<Grao>,
    @ColumnInfo(name = "quantidade") var quantidade: Double,
    @ColumnInfo(name = "numero_lote") var numeroLote: String
)
