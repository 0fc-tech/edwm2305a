package com.eniecole.mod8dicelauncher

import androidx.lifecycle.ViewModel

class DiceViewModel : ViewModel() {
    var valueDice : Int=0
    fun launchDice(maxValue: Int): Int {
        valueDice = (1..maxValue).random()
        return valueDice
    }
}