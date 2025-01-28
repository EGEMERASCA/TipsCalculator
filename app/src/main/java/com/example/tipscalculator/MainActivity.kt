package com.example.tipscalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipscalculator.databinding.ActivityMainBinding

//programar as views
//recuperar as viewa do layout
//find view by id
//view binding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.rgOpitionOne.setOnCheckedChangeListener { _, isChecked ->

        }
        binding.rgOpitionTwo.setOnCheckedChangeListener { _, isChecked ->

        }
        binding.rgOpitionThree.setOnCheckedChangeListener { _, isChecked ->

        }

        binding.btnDone.setOnClickListener {

        }
    }
}