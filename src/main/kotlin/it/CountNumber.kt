package it

fun main() {

    println(countNumber(4452))
    println(countNumber(44))
    println(countNumber(4))
    println(countNumber(0))

}

private fun countNumber(number: Int): Int {
    var count = 0

    /**
     * By default function parameter is final that's why
     *I used var varNumber = number to assign the final number to mutable var Number
     */
    var varNumber = number
    while (varNumber > 0) {
        count++
        varNumber /= 10
    }
    return count
}