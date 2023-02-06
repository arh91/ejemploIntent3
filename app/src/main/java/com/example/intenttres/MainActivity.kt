package com.example.intenttres

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.intenttres.main.OneFragment
import com.example.intenttres.main.TwoFragment


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerOne, OneFragment.newInstance())
                .commitNow()
        }*/

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val one = OneFragment()
        fragmentTransaction.add(R.id.fragmentContainerOne, one)
        fragmentTransaction.commit()

        val two = TwoFragment()
        fragmentTransaction.add(R.id.fragmentContainerTwo, two)
        fragmentTransaction.commit()


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