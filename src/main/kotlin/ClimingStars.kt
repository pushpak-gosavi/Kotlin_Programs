fun main() {
    val n = 5
    println(climingStars(n))
}

fun climingStars(n: Int):Int{
    return if (n < 3) n
    else {
        var n1 = 1
        var n2 = 2
        repeat(n - 2){
          n2 +=n1
          n1 = n2- n1
        }
        n2
    }
}