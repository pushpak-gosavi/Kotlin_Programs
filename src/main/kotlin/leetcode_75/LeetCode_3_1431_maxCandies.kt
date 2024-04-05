package leetcode_75

fun main(){
    val candies = listOf(2,3,5,1,3)
    val extraCandies = 3

    val findMaxCandies = candies.maxOrNull()?:0
    println(findMaxCandies)

    val ans = List(candies.size){index ->
        candies[index] + extraCandies >= findMaxCandies
    }
    println(ans)
}