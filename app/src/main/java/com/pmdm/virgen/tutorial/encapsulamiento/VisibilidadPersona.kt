package com.pmdm.virgen.tutorial.encapsulamiento

/*
Ejemplo para entender los modificadores de visiblidad.
1.- public (accesible desde cualquier clase)
2.- private (sólo accesible desde dentro de la clase)
3.- protected (público para subclases y privadas para el resto)-
4.- internal (públicas para clases fuera de un móudlo)
 */

/*
Ejemplo de clase con visibilidad pública.
 */
class VisibilidadPersona {
    var name : String ? =null

    set(value) {
        if (value != null){
            if (value!!.isNotEmpty()){
                field = value.uppercase()
            }
            else
                field = "<Sin nombre>"
        }else
            println("No puedes asignar null al nombre")
    }

    public fun myName()  {
        name?.let {
            println(name)
        }?: run {
            println ("No tiene nombre")
        }
    }
}


/*
Ejemplo de clase con visibilidad privada. El concepto de atributos privados con los setters y getters, cambia con respecto a java
Si ponemos un atributo private, la única forma de acceder es por medio de métodos públicos (igual que java). Kotlin, lo hace diferente
porque no pone atributos privados y utiliza el concepto de set/get para una validación.
 */
class VisibilidadPersonaPrivada {
    var name : String ? =null

        set(value) {
            if (value != null){
                if (value!!.isNotEmpty()){
                   field = value
                }
                else
                    field = "<Sin nombre>"
            }else
                println("No puedes asignar null al nombre")
        }

        get() = field

    private var lower : Boolean = true  //supondremos siempre que por defecto es minúscula


    public fun myName()  {
        name?.let {
            println(name)
        }?: run {
            println ("No tiene nombre")
        }
    }

    private fun changeLowerToUpper() : Unit {
        name = name?.uppercase()
        lower = false
    }

    private fun changeUpperToLowwer() : Unit {
        name = name?.lowercase()
        lower = true
    }

    public fun exchangeUpperOLower(change : Boolean): Unit {
        if (change)
            changeLowerToUpper()
         else
             changeUpperToLowwer()
    }

    public fun stateName()= lower.apply {
        if (this) println("Está en minúscula") else println("Esta en mayúscula")
    }



    override fun toString() = "Nombre: ${name}"

}

/*
Ejemplo de visibilidad protected. Subclase.
Haremos una clase con una función protected, para que sea pública desde la subclase
y privada desde fuera.
 */

open class VisibilidadPersonaPrivada2 {

    protected fun myName(){
        val myVar = VisibilidadPersonaPrivada()
        myVar.name = "Sonia"
        println(myVar.name)
    }
}

//Subclase, que hereda de la anterior. Por tanto puedo acceder a su método como si fuera público
class VisibilidadPersonaPrivada3 :  VisibilidadPersonaPrivada2(){

    //Lo hago público para ver que puedo acceder desde fuera.
    fun myNameForPrivada3(){
        println("Desde dentro de un objeto de VisibilidadPersonaPrivada3")
        myName()
    }
}