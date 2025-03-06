package leetcode_daily

fun main() {
    //val grid = listOf<List<Int>>(listOf(1, 3), listOf(2, 2))
   //val result =  getresult(grid)
    val array: Array<Array<Int>> = arrayOf(arrayOf(1,3,4), arrayOf(2,2,5,6,9,11,13,19))
    println(getresult(array))
}

fun getresult (grid:Array<Array<Int>> ): MutableList<Int>{
    val unFoldList = mutableListOf<Int>()
    grid.forEachIndexed { _, ints ->
        for (i in ints) {
            unFoldList.add(i)
        }
    }
    val newMap = unFoldList.groupBy { it }.mapValues { it.value.size }

    val newList = mutableListOf<Int>()
    for ((key, value) in newMap) {
        if (value > 1)
            newList.add(key)
    }
    println(newList)
    var checGap = false
    val listToSet = unFoldList.toSet().sorted()
    for (i in listToSet.indices - 1) {
        if (i != listToSet.size - 1) {
            if (listToSet[i + 1] - listToSet[i] != 1) {
                newList.add(listToSet[i] + 1)
                checGap = true
            }
        } else if (listToSet.size - 1 == i && !checGap) {
            newList.add(listToSet[i] + 1)
            break
        }
    }

    return newList
}