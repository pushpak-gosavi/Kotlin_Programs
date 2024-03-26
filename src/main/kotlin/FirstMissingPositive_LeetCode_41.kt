fun main(){
    val givenList = listOf(4,0,1,3)
    var missingNumber = 0
    val sortedList=givenList.sorted()
    for(i in 0 until sortedList.size-1){
        if(sortedList[i] > 0){
            if (sortedList[i] - sortedList[i+1] != 1){
               missingNumber= sortedList[i]+1
                break
            }
        }
    }
    println(missingNumber)

}