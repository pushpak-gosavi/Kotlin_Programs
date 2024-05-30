package it

fun main(){
    val first = listOf<Int>(1,2,5)
    val second = listOf<Int>(1,2,5,6,7)
    println(twoSumList(first,second))
}

private fun twoSumList(firstList:List<Int>, secondList:List<Int>) : List<Int>{
    if(firstList.size < secondList.size)
        return twoSumList(firstList = secondList, secondList = firstList)
    val newList= mutableListOf<Int>()
        firstList.forEachIndexed{index, item ->
            if(secondList.size> index)
                newList.add(item+secondList[index])
            else newList.add(item)
        }
    return newList
}
