fun main(){

    for (i in 2..50)
    {
        getPrimeNumber(i)
    }
}

fun getPrimeNumber(number:Int): Boolean{
    var flag= false
    for (j in 2 until number){
        if(number % j == 0){
            flag = true
            break
        }
    }
    if(!flag)
        println("$number")
    return flag
}