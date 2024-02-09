fun main() {


    /*for(i in randomList.indices){
        if(largestNumber < randomList[i]) {
            largestNumber = randomList[i]
        }
        if (secondLargestNumber < randomList[i] && largestNumber > randomList[i]) {
            secondLargestNumber = randomList[i]
        }
    }

    println(largestNumber)
    println(secondLargestNumber)*/

    // println(secondHighestNumber(higestNumber = largestNumber))

    val randomList = listOf<Int>(-10,11, 13, 14);
    var firstHigh= Int.MIN_VALUE
    var secondHigh = Int.MIN_VALUE
    var thirdLargestNumber=Int.MIN_VALUE

    for (i in randomList){
        if(i > firstHigh){
            thirdLargestNumber = secondHigh
            secondHigh = firstHigh
            firstHigh= i
        }
//        else if(i >secondHigh && firstHigh!=i){
//            secondHigh = i
//        }
    }

    println(secondHigh)
    println(firstHigh)
    println(thirdLargestNumber)

}
