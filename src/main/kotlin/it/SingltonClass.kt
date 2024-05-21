package it

fun main(){
    Singlton.increaseCounter()
    println(Singlton.counter)
    Singlton.increaseCounter()
    println(Singlton.counter)

}

object Singlton{

    init {
        println("Singlton Call")
    }

     var counter= 0
    fun increaseCounter() = counter++
    fun printMessage(message:String){
        println("Message: $message")
    }

    init {
        println("Heloo World")
    }
}