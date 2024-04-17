package leetcode_75

fun main(){
    val str = "Hello    World"
    //val charArray= str.split(" ").filter { it.isNotEmpty() }.reversed().joinToString { " " }
    val charArray = str.split(" ").filter { it.isNotEmpty() }.reversed().joinToString(separator = " ")
    println(charArray)
//    var newStr = ""
//    for (i in charArray.size-1 downTo 0){
//        newStr += if (i !=0)
//            "${charArray[i]} "
//        else charArray[i]
//    }
//
//    println(newStr)
}