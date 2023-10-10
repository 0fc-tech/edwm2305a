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
        binding.button6.setOnClickListener {
            vm.launchDice(6)
            binding.vm = vm
        }
        binding.button8.setOnClickListener {
            vm.launchDice(8)
            binding.vm = vm
        }
        binding.button12.setOnClickListener {
             vm.launchDice(12)
            binding.vm = vm
        }
        binding.button16.setOnClickListener {
            vm.launchDice(16)
            binding.vm = vm
        }
    }
}