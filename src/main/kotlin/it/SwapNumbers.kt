package it

fun main(){
    var a = 10
    var b = 20

    println("a=$a and b=$b")
 //   a=b.also { b=a }

    a += b
    b= a-b
    a -= b

    println("a=$a and b=$b")
}