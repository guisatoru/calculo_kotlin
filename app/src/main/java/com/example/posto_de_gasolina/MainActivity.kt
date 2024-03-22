package com.example.posto_de_gasolina

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // criando variaveis com formatos fechados
        val entradaDinheiro: EditText
        val entradaValor: EditText
        val calcular: Button
        val litrosGasolina: EditText
        // Chamando as variaveis do activity_main
        entradaDinheiro = findViewById<View>(R.id.entradaDinheiro) as EditText
        entradaValor = findViewById<View>(R.id.entradaValor) as EditText
        calcular = findViewById<View>(R.id.calcular) as Button
        litrosGasolina = findViewById<View>(R.id.litrosGasolina) as EditText

        calcular.setOnClickListener {
            val string = entradaDinheiro.text.toString()
            val string2 = entradaValor.text.toString()
            val valor = string2.toInt()
            val dinheiro = string.toInt()
            val litros = dinheiro.toDouble() / valor.toDouble()
            val litrosFormatados = String.format("%.2f litros", litros)
            litrosGasolina.setText(litrosFormatados)
        }
    }
}