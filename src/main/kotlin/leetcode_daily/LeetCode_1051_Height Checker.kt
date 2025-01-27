package leetcode_daily

fun main(){
    val list = listOf(4,5,0,-2,-3,1)
    val sortedList = list.sorted()

    println(list)
    println(sortedList)
    var hightMismatch=0
    for (i in list.indices){
        if (list[i] != sortedList[i] || list[i] < 0)
            hightMismatch++
    }

    println(hightMismatch)
}

