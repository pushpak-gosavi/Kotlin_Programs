package it

import Pushpak
import kotlin.properties.Delegates

fun main(){
//    val name = "Pushpak Gosavi"
//    println(name)
//    val newName = name.apply {
//       //number = this.toInt().inc()
//        println(this.toCharArray().toList())
//    }
//    println(newName)
//    println(number.inc())
    // var number: Int = 0

    println(dango)
    var number:Int? =0
    dango = "hello"
    val length = dango?.let {name ->
      number =  name.toInt()
        name.length
    }?: 1000

    println(length)
    println(number)
}

 var dango:String? = null