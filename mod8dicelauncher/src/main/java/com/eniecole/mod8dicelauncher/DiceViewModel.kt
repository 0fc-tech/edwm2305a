package com.eniecole.mod8dicelauncher

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    val valueDice = MutableLiveData(0)
    fun launchDice(maxValue: Int){
        valueDice.value = (1..maxValue).random()
    }
}