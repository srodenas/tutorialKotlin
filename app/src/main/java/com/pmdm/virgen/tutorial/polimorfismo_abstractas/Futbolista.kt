package com.pmdm.virgen.tutorial.polimorfismo_abstractas

class Futbolista : SeleccionFutbol {

    /*
    Como en java. Creamos nuestro constructor secundario y llamamos al super del padre.
     */
    constructor(id : Int, name: String, surname: String, age : Int, dorsal : Int, demarcacion : String?) :
            super(id, name, surname, age) {
        this.dorsal = dorsal
        this.demarcacion = demarcacion


    }
    var dorsal : Int = 0

    var demarcacion : String? = null
    set(value) {
        if (value == null) println("Este jugador no tiene ninguna demarcación, hay que ponerle una.")
        else field = value
    }
    get() {
        field.let {
            return field
        }?: run {
            field = "Sin demarcacion..."
        }
    }

    //jugar Partido
    fun playGame() : Unit{
        println("El jugador con nombre $name, $surname, está jugando un partido de futbol")
    }

    //entrenar
    fun train() : Unit{
        println("El jugador con nombre $name, $surname, está entrenando")
    }

    override fun training() {
        println("El jugador con nombre $name está entrenando")
    }

    override fun toString() = "Jugador con id= $id, nombre es $name, $surname, con edad $age, con dorsal $dorsal y demarcacion $demarcacion"
}