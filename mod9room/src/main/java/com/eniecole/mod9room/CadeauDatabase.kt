package com.eniecole.mod9room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
@Database(entities = [Cadeau::class], version = 1)
abstract class CadeauDatabase : RoomDatabase() {
    abstract fun cadeauDao(): CadeauDao


    companion object{
        @Volatile
        private var INSTANCE : CadeauDatabase? = null
        fun getInstance(context: Context) : CadeauDatabase{
            synchronized(this){
                var instance = INSTANCE
                if(instance == null){
                    instance = Room.databaseBuilder(
                        context,CadeauDatabase::class.java, "cadeaux"
                    ).fallbackToDestructiveMigration()
                    .build()
                    INSTANCE = instance
                }
                return instance
            }
        }
    }
}