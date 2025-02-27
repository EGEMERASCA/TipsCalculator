package com.example.tipscalculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

/////////////////////////////
// conectar a page quando done
// recuperar valores
// mostrar resultado + descriçao da conta
// opcao de voltar
////////////////////////////
class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val totalTable = intent.getFloatExtra("totalTable", 0.0f)
        val numPeople = intent.getIntExtra("numPeople", 0)
        val percentage = intent.getIntExtra("percentage", 0)
        val totalAmount = intent.getFloatExtra("totalAmount", 0.0f)

        println("Ai calica  " + totalAmount)
    }
}