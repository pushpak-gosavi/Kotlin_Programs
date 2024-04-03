package leetcode_75

fun main(){
    val list = listOf(1,2,7,9,11)
    println(twoSum(list = list, target = 16))

}
fun twoSum(list: List<Int>, target:Int):List<Int>{
    val twoSumList= mutableListOf<Int>()
    for (i in list.indices){
        for (j in i+1 until  list.size){
            if (list[i]+list[j]==target){
                twoSumList.add(list[i])
                twoSumList.add(list[j])
            }
        }
    }
    return twoSumList
}