package it

fun main(){

    val result = sumHigherOrder(first = 10, second = 10) {
        it
    }
    println(result)

    val sum:(Int,Int) -> Int = {x:Int, y:Int -> x+y}
    println(sum(5, 5))
}

private fun sumHigherOrder(first:Int, second:Int, addition:(Int) -> Int):Int{
    val result = first+second
    return addition(result)
}