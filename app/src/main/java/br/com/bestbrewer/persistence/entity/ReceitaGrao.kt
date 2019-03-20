package br.com.bestbrewer.persistence.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "receita_grao",
    foreignKeys = [ForeignKey(
        entity = Grao::class,
        parentColumns = arrayOf("id"),
        childColumns = arrayOf("grao_id"),
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
data class ReceitaGrao(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") var id: Long,
    @ColumnInfo(name = "grao_id") var graoId: Long,
    @ColumnInfo(name = "receita_id") var receitaId: Long
)
