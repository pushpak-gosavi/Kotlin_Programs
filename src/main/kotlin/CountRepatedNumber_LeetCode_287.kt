fun main(){

    val repatedNumber = mutableListOf(1,2,3,3,0,0)
    val newMap = repatedNumber.groupBy { it }.mapValues { it.value.size }
    for ((key, value) in newMap){
        if (value > 1){
            println(key)
            break
        }
    }
}
