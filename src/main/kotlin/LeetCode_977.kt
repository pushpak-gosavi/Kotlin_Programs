fun main(){
    var myArrary= mutableListOf<Int>(-4,-1,0,3,10)
     var newEmptyArray:MutableList<Int> = mutableListOf()

    for(i in myArrary){
        newEmptyArray.add(i*i)
    }
    println(newEmptyArray.sorted().toIntArray())

    myArrary.forEach { number ->
        myArrary[myArrary.indexOf(number)] = number*number
    }
    println(myArrary.sorted())
}