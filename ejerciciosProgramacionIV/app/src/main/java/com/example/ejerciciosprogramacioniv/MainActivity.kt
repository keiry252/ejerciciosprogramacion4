package com.example.ejerciciosprogramacioniv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}

//  EJERCICIO NUMERO 1

fun Ejercicio1 (nombre: String, pagoH: Int, canH: Int, HExtras: Int) {

    if(HExtras > 0){

        var sueldo: Int = pagoH * (canH + HExtras)
        var HoraT : Int = canH + HExtras

        println("El nombre del empleado es: $nombre")
        println("Su sueldo es de: $sueldo")
        println("El total de horas trabajadas son de: $HoraT")
    }
    else if (HExtras == 0)
    {
        var sueldo: Int = pagoH * canH


        println("El nombre del empleado es: $nombre")
        println("Su sueldo es de: $sueldo")
        println("El total de horas trabajadas son de: $canH")
        println("El empleado no ha realizado horas extras")

    }


}

//  EJERCICIO NUMERO 2

fun Ejercicio2 (numero: Int, parametro: Int){

    if(parametro != 10 )
    {
        for (i in 0..parametro )
        {
            println("$numero x $i = ${numero * i}")
        }
    }
    else
    {
        for (i in 0..10 )
        {
            println("$numero x $i = ${numero * i}")
        }
    }
}

//  EJERCICIO NUMERO 3

val emple = Empleado("keiry", sueldo = 100.00, area = "Recursos Humanos", cargo = "", tiempo = 5)

//  EJERCICIO NUMERO 4

val dado = Dado (valor = 6)