package com.pmdm.virgen.tutorial.interfaces

/*
Clase abstracta

 */
abstract class SeleccionFutbol {
    protected var id : Int = 0


    protected var name : String?= null
        set(value) {
            if (value!= null){
                if (value!!.isNotEmpty())
                    field= value!!.uppercase()
            }else{
                println("El nombre no puede ser nulo")
                field = ""
            }
        }


    protected var surname : String?= null
        set(value) {
            if (value!= null){
                if (value!!.isNotEmpty())
                    field = value!!.uppercase()

            }else{
                println("El apellido no puede ser nulo")
                field = ""
            }
        }


    protected var age : Int = 0




    constructor(id : Int, name: String, surname: String, age : Int){
        this.id = id
        this.name = name
        this.surname = surname
        this.age = age
    }

    override fun toString() : String = "integrante con id= $id, nombre es $name, $surname, con edad $age"

}