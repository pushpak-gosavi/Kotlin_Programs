package it

fun main(){
    val givenList = mutableListOf(1,2,3,4,5,6,7)
    val number = 3

    println(arrangeList(givenList,number))

}

fun arrangeList(list:MutableList<Int> , k:Int) : MutableList<Int>{
    val newList = mutableListOf<Int>()
    var j = list.size-1
    for (i in list.size-k until list.size){
        newList.add(list[i])
    }
    for (x in 0 until list.size-k){
        newList.add(list[x])
    }
    return newList
}