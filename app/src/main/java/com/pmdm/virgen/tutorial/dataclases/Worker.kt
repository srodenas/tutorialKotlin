package com.pmdm.virgen.tutorial.dataclases


//Defino un ojeto de tipo trabajador.
//Por defecto, nos implementa funciones que no tenemos que implementar.
//hasCode y toString, no hay que implementar. Nos ahorra código.
data class Worker(val name: String = "", val age : Int = 20, val work : String = ""){
    var lastWork : String = "" //podemos seguir añadiendo propiedades
    var anioLastWork : Int

    init {
        this.anioLastWork = 2023
    }
}
