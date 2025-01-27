fun main(){
    val arr = listOf(1,2,3,8,9,0,4,5)
    var max = 0
    var secondLargest = 0

    arr.forEachIndexed { index, i ->
        if(max < i){
            secondLargest = max
            max = i
            }
        if (secondLargest < i && max > i)
            secondLargest = i
    }

    /*for (i in arr.indices){
        if (max < arr[i]) {
            secondLargest = max
            max = arr[i]
        }
        if (secondLargest < arr[i] && max > arr[i])
            secondLargest = arr[i]
    }*/

    println("largest number is $max")
    println("Second largest number is $secondLargest")
}