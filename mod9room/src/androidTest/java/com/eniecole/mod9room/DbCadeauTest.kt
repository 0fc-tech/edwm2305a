package com.eniecole.mod9room

import android.content.Context
import androidx.room.Room
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class DbCadeauTest {
    private lateinit var dbCadeaux : CadeauDatabase

    @Before
    fun createdDB(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        dbCadeaux = Room.inMemoryDatabaseBuilder(context,CadeauDatabase::class.java).build()
    }

    @Test
    fun addMBP(){
        val mbp = Cadeau(0L,"MBP 16 pouces M2PRO", 45000f,1.2f,1)
        val idMBP = dbCadeaux.cadeauDao().insert(mbp)
        val mbpDB = dbCadeaux.cadeauDao().get(idMBP)
        assert(mbpDB?.nom == mbp.nom)
        assert(mbpDB?.prix == mbp.prix)
        assert(mbpDB?.stock == mbp.stock)
    }
}