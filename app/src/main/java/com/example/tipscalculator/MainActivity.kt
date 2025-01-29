package com.example.tipscalculator

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
                binding.tvResult.text = String.format("Total with tips: %.2f", totalwtips)
            }
        }

        binding.btnClean.setOnClickListener {
            binding.tvResult.text = ""
            binding.tieTotal.setText("")
            binding.tieNpeople.setText("")
            binding.rgOpitionOne.isChecked = false
            binding.rgOpitionTwo.isChecked = false
            binding.rgOpitionThree.isChecked = false

            //transferir resultado para proxima pagina
            //deicar botoes em baixo
            //apg tools txt
            //fazer ui
            //elaborar logo
            //modo norturno
            //ver paleta de cores
            //basic é isso
        }
    }
}