fun main(){
    val list= listOf(1,2,3,4,5,6,7) // output (5,6,7,1,2,3,4)
    println(swapList(list, 3))
    
}

fun swapList(list:List<Int>, swapNumber: Int):MutableList<Int>{
    val swapList = mutableListOf<Int>()
    for (i in list.size-swapNumber until list.size){
        swapList.add(list[i])
    }
    for (j in 0 until  list.size-swapNumber){
        swapList.add(list[j])
    }
    return swapList
}