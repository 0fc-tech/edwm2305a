package com.eniecole.mod8dicelauncher

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.eniecole.mod8dicelauncher.databinding.ActivityLaunchDiceBinding

class LaunchDiceActivity : AppCompatActivity() {
    lateinit var binding : ActivityLaunchDiceBinding
    val vm by viewModels<DiceViewModel>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_launch_dice)

        binding.lifecycleOwner = this
        binding.vm = vm
        //J'observe le changement de valeur de valueDice
        //Et je change le texte en fonction de la valeur
        vm.valueDice.observe(this){dice->
            if (dice>10){
                binding.textViewDiceValue.textSize = 40f
            }else{
                binding.textViewDiceValue.textSize = 12f
            }
        }
        binding.button6.setOnClickListener {
            vm.launchDice(6)
            //binding.vm = vm
        }
        binding.button8.setOnClickListener {
            vm.launchDice(8)
            //binding.vm = vm
        }
        binding.button12.setOnClickListener {
             vm.launchDice(12)
            //binding.vm = vm
        }
        binding.button16.setOnClickListener {
            vm.launchDice(16)
            //binding.vm = vm
        }
    }
}