fun main(){
    drawPyramid(number = 5)
    drawInversePyramid(number = 5)
}

private fun drawPyramid(number:Int){
    for(i in 0 until  number){
        for(j in 0 .. number-i){
            print(" ")
        }
        for (k in 0 .. i){
            print("* ")
        }
        println("")
    }
}

private fun drawInversePyramid(number:Int){
    for (i in number downTo 1){
        for (j in number-i downTo 0){
            print(" ")
        }
        for (k in  i downTo 1){
            print("* ")
        }
        println("")
    }
}