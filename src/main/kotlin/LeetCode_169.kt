fun main(){
    /**
     * Print the max repated number from list number from
     */
    val numList = listOf<Int>(2,2,1,1,1,2,2)

    println(numList)

    val countTheItem = numList.groupBy { it }.mapValues { it.value.size }
    var maxValue= Int.MIN_VALUE
    var maxKey= Int.MIN_VALUE
    for (i in countTheItem){
        if(maxValue<i.value) {
            maxValue = i.value
            maxKey = i.key
        }
    }
    println(maxKey)
    println(maxValue)

}