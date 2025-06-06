package com.example.tipscalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipscalculator.databinding.ActivityMain2Binding

class MainActivity2 : AppCompatActivity() {

    private lateinit var binding: ActivityMain2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val totalTable = intent.getFloatExtra("totalTable", 0.0f)
        val numPeople = intent.getIntExtra("numPeople", 0)
        val percentage = intent.getIntExtra("percentage", 0)
        val totalAmount = intent.getFloatExtra("totalAmount", 0.0f)
        val totalAmountWithTips = intent.getFloatExtra("totalAmountWithTips", 0.0f)

        binding.tvPercentage.text = percentage.toString() + "%"
        binding.tvTotalAmount.text = "%.2f".format(totalAmount)
        binding.tvNumPeople.text = numPeople.toString()
        binding.tvTotalTabel.text = "%.2f".format(totalTable)
        binding.tvTotalWtips.text = "%.2f".format(totalAmountWithTips)

        binding.btnBack.setOnClickListener {
            finish()
        }
    }
}