package com.eniecole.mod9room

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Cadeau(
    @PrimaryKey(autoGenerate = true)
    val id: Long,
    val nom: String,
    val prix: Float,
    @ColumnInfo(name = "poids_kg")
    val poidsKg : Float,
    val stock: Int
)
