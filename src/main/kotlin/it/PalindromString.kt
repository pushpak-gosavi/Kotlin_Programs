package it

fun main(){
    val name = "apaaa"
    var i = 0
    var j = name.length-1
    var isPalindrom = true
    while (i<j){
        if (name[i] != name[j]){
            //println("$name is not palidrom")
            isPalindrom = false
            break;
        }
        i++
        j--
    }

    if (isPalindrom)
        println("$name is Palindrom")
    else println("$name is not Palindrom")
}