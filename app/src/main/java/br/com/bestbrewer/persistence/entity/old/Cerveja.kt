package br.com.bestbrewer.persistence.entity.old

import androidx.room.ColumnInfo
import androidx.room.PrimaryKey

data class Cerveja(@PrimaryKey @ColumnInfo(name = "id") val id : Long) {
}