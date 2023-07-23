package com.pmdm.virgen.tutorial.interfaces

class Jugador : SeleccionFutbol, IntegranteSeleccionFutbol {


    constructor(id : Int, name: String, surname: String, age : Int, dorsal : Int, demarcacion : String?)
            : super(id, name, surname, age)
    {
                this.demarcacion = demarcacion
    }


    //Obligados a sobreescribir los atributos de la interfaz.
    override var anio: Int = 2023 //Lo ponemos por defecto.
        get() = field
        set(value) {
            field = value
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
            } ?: run {
                field = "Sin demarcacion..."
        }
   }

//Estos métodos son los que deben implementar de la interfaz.
    override fun training() {
        println ("El jugador con nombre $name esta entrenando")
   }

    override fun travel() {
        println ("El jugador con nombre $name esta viajando")
    }

    override fun toString() =  super.toString() +  " con dorsal $dorsal y demarcacion $demarcacion"

}