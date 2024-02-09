fun main(){
    val firstList = listOf<Int>(1,2,6,7,8,10)
    val backup = listOf<Int>(1,2,3,4)

    //println(firstList.indexOf(0).compareTo(backup.indexOf(0)))

   // println(firstList.listIterator().nextIndex().compareTo(backup.listIterator().nextIndex()))

     for (i in firstList.indices){
        if (backup.contains(firstList[i]))
            println(firstList[i])
    }
}