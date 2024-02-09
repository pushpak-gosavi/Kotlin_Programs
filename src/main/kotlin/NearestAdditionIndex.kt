fun main(){
    val inList = listOf<Int>(1, 3, 2, 10, 113, 15, 16)
    val addition = 3
    /*val mutableIndexSet = mutableListOf<Int>()
    for(i in inList.indices){
        for (j in i..inList.lastIndex){
            if(i + inList[j] == addition ){
                mutableIndexSet.add(inList.indexOf(i))
                mutableIndexSet.add(j)
            }
        }
    }

    println(mutableIndexSet)*/

    /**
     * Second way
     */
    val mutableHashMap = inList.groupBy { it }
    println(mutableHashMap)
    var number = 0

    for (i in inList.indices){
        number = addition - inList[i]
        if (mutableHashMap.containsKey(number)){
            println("print the number ${i}")
        }
    }
}