package com.example.tipscalculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

//valor total conta
//numero de pessoass
//porcentagem tips
//10%, 15% ou 20%
// calcular / limpar

//programar as views
//recuperar as viewa do layout
//find view by id
//view binding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Camel case

        val tvTitle: TextView = findViewById(R.id.tv_title)
        val btnClean: Button = findViewById(R.id.btn_clean)

        btnClean.setOnClickListener {
            tvTitle.text = "Novo texto"
        }
    }
}