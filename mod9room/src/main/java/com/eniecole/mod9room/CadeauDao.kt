package com.eniecole.mod9room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface CadeauDao {
    @Query("SELECT * FROM Cadeau WHERE id = :id")
    fun get(id: Long) : Cadeau?
    @Query("SELECT * FROM Cadeau")
    fun getAll() : List<Cadeau>?
    @Insert
    fun insert(cadeau: Cadeau) : Long
    @Insert
    fun insertAll(cadeaux : List<Cadeau>)
    @Delete
    fun delete(cadeau: Cadeau)
    @Delete
    fun deleteAll(cadeaux : List<Cadeau>)
}
