package leetcode_75

fun main() {
    val str = "hello"
    val listOfVowels = listOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
    val reverseString = str.toCharArray()
    val newMap = str.mapIndexed{index: Int, c: Char -> index to c }.toMap()
    val newMutableList = mutableListOf<Int>()

    for(i in str){
        if (listOfVowels.contains(i)){
            newMutableList.add(str.indexOf(i))
        }
    }
}