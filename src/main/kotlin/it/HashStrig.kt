package it

fun main(){
    val name="Android"
    println(name.hashConverter())
    println(name)
}
// After 2 char need to print #

fun String.hashConverter():String{
    var newHash=""
    for (i in indices){
        if(i<2)
            newHash+=this[i]
        else newHash+="#"
    }
    return newHash
}