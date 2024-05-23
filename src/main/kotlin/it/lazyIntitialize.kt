package it

fun main(){

    val name:Lazy by lazy {
        Lazy(name = "Pushpak")
    }

    println(name.name)

    lateinit var name1: String

println(name::name)
}

data class Lazy(val name:String)