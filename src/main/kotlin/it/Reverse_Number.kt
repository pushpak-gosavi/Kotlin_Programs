package it

fun main(){
    var number = 1234
    var revNumber = 0
    while (number !=0){
        val digit = number%10
        print("$digit ")
        revNumber = revNumber *10 + digit
        print(" $revNumber ")
        number/=10
        print(" $number")
        println()
    }
    println(revNumber)
}