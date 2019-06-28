package com.example.calcularedad

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.Exception
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun CalcularEdad(view: View){

        try {
            val anioNacimiento = txtAnioNacimiento.text.toString().toInt()
            val anioActual= Calendar.getInstance().get(Calendar.YEAR)
            if (anioNacimiento>1900 && anioNacimiento< anioActual){

                val edad = anioActual - anioNacimiento
                txtVistaEdad.text="TU EDAD ES $edad AÑOS"
            }else{

                txtVistaEdad.text="INGRESE UN AÑO VALIDO"
            }

        }catch (e:Exception){

            txtVistaEdad.text="INGRESE UN DATO VALIDO"

        }
    }
}
