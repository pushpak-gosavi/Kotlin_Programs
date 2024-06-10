fun main(){
    val name:String? = null
   val par =  name?.let {
        println(it.length)
    } ?: 0

    println(par)
}