package com.example.intenttres

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerOne, OneFragment.newInstance())
                .commitNow()
        }*/


        val siguiente = findViewById<Button>(R.id.btnSiguiente)
        val salir = findViewById<Button>(R.id.btnSalir)

        siguiente.setOnClickListener(){
            val intentTwo = Intent(this, SecondActivity::class.java)
            startActivity(intentTwo)
        }

        salir.setOnClickListener(){
            finishAffinity()
        }
    }
}