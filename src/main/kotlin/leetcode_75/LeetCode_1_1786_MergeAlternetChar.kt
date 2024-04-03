package leetcode_75;
fun main(){
    val firstString = "abcde"
    val secondString = "pq"
    var alternetString =""
    println(maxOf(firstString.length, secondString.length))
   for (i in 0 until maxOf(firstString.length, secondString.length)){
       if (i < firstString.length)
            alternetString+=firstString[i]
       if (i < secondString.length)
           alternetString+=secondString[i]
   }
    println(alternetString)

}