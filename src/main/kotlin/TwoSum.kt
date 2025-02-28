fun main() {
    val firstList = listOf(1,2,4,5,6)
    val secondList = listOf(1,2,4,5)
    println(twoSumList(firstList, secondList))
}

fun twoSumList(fristList:List<Int>, secondList:List<Int>):MutableList<Int> {

    val newList:MutableList<Int> = mutableListOf<Int>()

    if(fristList.size < secondList.size){
        return twoSumList(secondList, fristList)
    }else{
        for(i in fristList.indices){
            if(secondList.size > i) {
                val number = fristList[i] + secondList[i]
                newList.add(number)
            }else newList.add(fristList[i])
        }
    }

    return newList
}