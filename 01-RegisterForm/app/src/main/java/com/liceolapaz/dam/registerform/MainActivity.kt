package com.liceolapaz.dam.registerform

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Spinner

class MainActivity : AppCompatActivity() {

    private lateinit var countrySelector : Spinner


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countrySelector = findViewById(R.id.country_selector)

        val adaptador =
            ArrayAdapter.createFromResource(this, R.array.valores_array, android.R.layout.simple_spinner_item)

        adaptador.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        countrySelector.adapter = adaptador
    }
}