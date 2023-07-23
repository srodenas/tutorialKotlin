package com.pmdm.virgen.tutorial.clases_internas

import android.content.Intent

class Calculadora (
    private var ope1: Int,
    private var ope2: Int,
    var resul: Int = 0
){


    //Clase que sóno es accesible a partir de la clase externa.
    class Operacion{

        fun suma(a: Int, b: Int) : Int {return a+b}
        fun resta(a: Int, b: Int) : Int = a-b

    }

    //Queremos acceder a las propiedades de la clase Externa. Por ello tengo que hacerla inner
    inner class OperacionInner{
        fun suma(): Unit{
            resul = ope1 + ope2

        }
        fun resta(): Unit {
            resul = ope1 - ope2
        }

    }
}