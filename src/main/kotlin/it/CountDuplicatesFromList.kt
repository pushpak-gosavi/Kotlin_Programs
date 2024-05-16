package it

fun main(){
    val numberList = listOf(1,2,3,4,4,4,3)
    println(numberList)

    val duplicate = numberList.groupBy { it }.mapValues { it.value.size }.filter { it.value > 1 }.keys
    println(duplicate)
}