package com.example.tipscalculator

import android.health.connect.datatypes.units.Percentage
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipscalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var percentage: Int = 0

        binding.rgOpitionOne.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 10
            }
        }
        binding.rgOpitionTwo.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 15
            }
        }
        binding.rgOpitionThree.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
                percentage = 20
            }
        }

        binding.btnDone.setOnClickListener {
            val vTotal: Float = binding.tieTotal.text.toString().toFloat()
            val nPeople: Int = binding.tieNpeople.text.toString().toFloat()

            val totaltemp = vTotal / nPeople
            val totalWithTips = totaltemp * percentage / 100
        }
    }
}