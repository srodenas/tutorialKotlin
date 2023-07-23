package com.pmdm.virgen.tutorial.lambda

/*
Una lambda, nos permite almacenar en una variable, funciones.
 */

fun lambda1(){
    val myList = arrayListOf(0,1,2,3,4,5,6,7,8,9,10)
    val myNewFilter = myList.filter {myInt->  //puedo redefinir el parametro it, con el nombre myInt
        //devuelve un nuevo listado teniendo en cuenta la condición que le pondremos.
        //Nosotros definiremos en código la operación de filtrado. Por tanto una lambda

        println(myInt)
        if (myInt == 1){
            return@filter true  //de esta forma, retornamos también que el 1 es válido.
        }
        myInt > 5  //ultima sentencia, es lo que devuelve
    }
    println(myNewFilter)

}



fun lambda2(){
    val mySumFun = fun (a:Int, b: Int): Int{
        return a + b
    }

    val mySumFun2 = fun (a: Int, b: Int) : Int = a + b  //lo mismo que la anterior
    val myMulFun  = fun (a: Int, b: Int) : Int = a * b

    val res = myOperationFun(2,4, myMulFun)   //estamos pasándole los dos enteros y la función.
    val res2 = myOperationFun(3,4, mySumFun2)
    println("Operacion de multiplicación: " + res)
    println("Operacion de suma $res2")

    println("Operacion de resta será " + myOperationFun(5,4, {
            a,b -> a - b

    }))

}

/*
Función que acepta dos enteros y una función del tipo: int, int -> int. No sabemos lo que hace
simplemente la llamamos con los parámetros que le pasamos.
 */
fun myOperationFun (a: Int, b: Int, operation: (Int, Int) -> Int) : Int {
    return operation (a, b)

}
