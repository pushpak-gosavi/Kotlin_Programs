package it

fun main(){
    val numbers = mutableListOf(1, 2, 0, 3, 0, 4, 5, 0)

    val countNumberofZeros = numbers.size - numbers.filter { it!=0 }.size

    println(countNumberofZeros)

    numbers.removeAll{it == 0}

    repeat(countNumberofZeros){
        numbers.add(0)
    }

    println(numbers)
}