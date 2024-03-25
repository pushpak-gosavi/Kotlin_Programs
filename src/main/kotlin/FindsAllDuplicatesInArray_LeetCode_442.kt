fun main(){
    val intList = listOf(1,2,3,3,0,2)
    val countTheItem = intList.groupBy { it }.mapValues { it.value.size }
    val duplicateItems = mutableListOf<Int>()
    for ((key, value) in countTheItem){
        if (value > 1){
            duplicateItems.add(key)
        }
    }
    println(duplicateItems)
}