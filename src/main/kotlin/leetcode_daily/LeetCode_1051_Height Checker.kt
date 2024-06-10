package leetcode_daily

fun main(){
    val list = listOf(1,1,4,2,1,3)
    val sortedList = list.sorted()
    var hightMismatch=0
    for (i in list.indices){
        if (list[i] != sortedList[i])
            hightMismatch++
    }

    println(hightMismatch)
}

