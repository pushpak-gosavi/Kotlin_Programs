fun main(){
    val first = "egt"
    val second = "add"

    val firstCharCount = first.groupBy { it }.mapValues { it.value.size }.values
    val secondCharCount = second.groupBy { it }.mapValues { it.value.size }.values
    if (firstCharCount.containsAll(secondCharCount))
        println(true)
    else println(false)
}