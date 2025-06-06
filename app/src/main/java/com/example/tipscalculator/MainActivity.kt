package com.example.tipscalculator

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.tipscalculator.databinding.ActivityMainBinding
import com.google.android.material.snackbar.Snackbar

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
            val vTotalTemp = binding.tieTotal.text
            val nPeopleTemp = binding.tieNpeople.text

            if (vTotalTemp?.isEmpty() == true ||
                nPeopleTemp?.isEmpty() == true
            ) {
                Snackbar.make(binding.tieTotal, "Preencha todos os campos", Snackbar.LENGTH_LONG)
                    .show()
            } else {

                val vTotal: Float = vTotalTemp.toString().toFloat()
                val nPeople: Int = nPeopleTemp.toString().toInt()

                val totaltemp = vTotal / nPeople
                val Tips = totaltemp * percentage / 100
                val totalwtips = totaltemp + Tips
                val TipsTotal = vTotal * percentage / 100
                val totalAmountWithTp = vTotal + TipsTotal

                val intent = Intent(this, MainActivity2::class.java)
                intent.apply {
                    putExtra("totalTable",vTotal)
                    putExtra("numPeople",nPeople)
                    putExtra("percentage",percentage)
                    putExtra("totalAmount",totalwtips)
                    putExtra("totalAmountWithTips",totalAmountWithTp)
                }
                clean()
                startActivity(intent)
            }
        }

        binding.btnClean.setOnClickListener {
            clean()
        }
    }

    private fun clean(){
        binding.tieTotal.setText("")
        binding.tieNpeople.setText("")
        binding.rgOpitionOne.isChecked = false
        binding.rgOpitionTwo.isChecked = false
        binding.rgOpitionThree.isChecked = false
    }
}