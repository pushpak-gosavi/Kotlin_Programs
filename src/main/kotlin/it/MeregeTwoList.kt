package it

fun main() {
    mergeTwoList()
    sumOfArray()
    findUniquevalue()
}

fun findUniquevalue() {
    val a = listOf(1,2,3,4,1,2,3,2,1)
    val unique = a.groupBy { it }.mapValues { it.value.size }.filter { it.value<2 }.keys
    println(unique)
}

private fun mergeTwoList() {
    val a = mutableListOf(1, 2, 3)
    val b = mutableListOf(4, 5, 6)
    val c = a.plus(b)
    val d = a.union(b)
    val e = a.zip(b)
    println(c)
    println(d)
    println(e)
}

private fun sumOfArray() {
    val a = listOf(1, 2, 3, 4)
    println(a.sum())
    var add = 0
    a.forEach { number ->
        add += number
    }
    println(add)
}