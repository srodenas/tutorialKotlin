package com.pmdm.virgen.tutorial.herencia_simple

//Forma más sencilla de declarar una clase. Lleva aparejado un constructor por defecto (primario)
/*
Todo lo que se defina dentro del () en la definición del class, se considera constructor primario
El constructor que se defina después, será el secundario.
 */
class P (var a: Int )

//Cuando se crea el objeto, no se le pasan argumentos. Se inicializan los atributos directamente.
class P0{
    var a: Int = 10
}
/*
Igual que el anterior.
 */
class P1(){
    var a: Int = 20
    }


/*Al definir constructor, se convierte en el constructor principal. No puedo instanciar con val p = P20()
El constructor por defecto
será el que haga en la declaración del atributo a = 0
 */
class P20{
    var a: Int = 0

    constructor(a: Int){
        this.a = a
    }


}


/*
Igual que el anterior.  No existe constructor primario, sólo dos secundarios. El constructor por defecto
será el que haga en la declaración del atributo a = 0
 */
class P2{
    var a: Int = 0

    constructor(){  //secundario
        a = 30
    }

    constructor(a: Int){ //secundario
        this.a = a
    }


}




class P3{
    var a : Int //no hace falta inicializarlo.

    //constructor principal
    constructor(){
        a = 30
    }

    //Definimos un segundo constructor. En este caso es secundario.
    constructor(a: Int){
        this.a = a
    }

}

// Definimos la clase y declaramos la propiedd que tendrá. No podremos crearlo con P4(), sino con P4(valor)
class P4 constructor(var a: Int)


/*
Aquí tengo un constructor primario y un secundario con más atributos. Debo delegar al primario con this.
 */
class P5 (var a: Int){
    var b: Int = 0  //tengo que inicializarlo por narices. ¿Qué pasa si sólo utilizo el primario?

    constructor( a: Int, b: Int) : this(a){
        //tengo que delegar  el atributo a, al primario.
        this.b= b
    }
}


class P6{
    var a: Int

    init {
        this.a = 0
    }
}

class P7(){  //() es el constructor primario
    var a: Int

    init {
        this.a = 0
    }
}

class P8 (a: Int){  //recibo un parámetro, pero no significa que sea un atributo.
    var a : Int  //Por narizes tendría que inicializarlo, ya que recibo un parámetro.

    init {
        this.a = a  //De esta forma, puedo dejar sin inicializar el atributo a.
    }
}

class P9 (){
    var a: Int

    init {
        this.a = 0
    }

    constructor(a: Int) : this() { //Porque debe delegar al constructor primario ()
        this.a = a
    }

}

/*
En este caso, fijaros como primero se inicializa el atributo a a 100 y luego extiende con el init.
 */
class P10{
    var a: Int = 100

    init {
        a = 200
    }
}








