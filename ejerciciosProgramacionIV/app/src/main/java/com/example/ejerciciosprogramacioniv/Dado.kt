package com.example.ejerciciosprogramacioniv

class Dado {
    var valor: Int = 0

    constructor( valor: Int)
    {

        this.valor = valor

        if (valor in 1..6)
        {
            println ((1..6).random())
        }
        else if (valor > 6)
        {
            println (1)
        }


    }
}