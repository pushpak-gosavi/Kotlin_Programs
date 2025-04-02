package leetcode_daily

fun main(){
    val firstList = listOf(listOf(1,2), listOf(2,3), listOf(4,5))
    val secondList = listOf(listOf(1,4), listOf(3,2),listOf(4,1))
   println(mergeTwoDArray(firstList, secondList))
}

fun mergeTwoDArray(first:List<List<Int>>, second:List<List<Int>>):List<List<Int>>{
     val mergedTwoDList:MutableList<MutableList<Int>> = mutableListOf(mutableListOf())

   println()
    var countIndex = 1
    for (i in first.indices){
        if(first[i].contains(second[i][0])){
            val sum = first[i][1] + second[i][1]
            mergedTwoDList.add(mutableListOf(countIndex, sum))
        } else
        countIndex ++
    }
    return mergedTwoDList
}