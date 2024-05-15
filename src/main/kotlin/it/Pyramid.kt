package it

fun main(){
    val number = 5
    straightPyramid(number = number)
    reversePyramid(number = number)
}

private fun straightPyramid(number:Int){
    for(i in 0 .. number){
        for (k in number downTo i){
            print(" ")
        }
        for (j in 0 until i){
            print("* ")
        }
        println()
    }
}

private fun reversePyramid(number:Int){
    for (i in number downTo 0){
        for (k in i ..  number){
            print(" ")
        }
        for (j in 0 until   i){
            print("* ")
        }
        println()
    }
}