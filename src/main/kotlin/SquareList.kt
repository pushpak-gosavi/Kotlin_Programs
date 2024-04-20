fun main(){

    val num = 100
    for (i in 2..num){
        checkIsPrimeNumber(i)
    }
}

fun checkIsPrimeNumber(num:Int){
    var isPrime= true
    for (i in 2 until num){
        if ( num%i==0) {
            isPrime = false
            break
        }
    }
    if (isPrime)
        println("$num is Prime")
}