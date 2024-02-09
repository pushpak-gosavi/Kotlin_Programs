fun main() {
   /* println(newMap)
    for (i in newMap.indices){
        for (j in i+1 until newMap.size){
            if (newMap[i] == newMap[j]){
                isSame = false
                println(isSame)
                break
            }
        }
    }

    if(!isSame){
        println("Number is repeate")
    }
    else println("Number is not reapte")*/

    println(setValues)
    println(newMap)

    if (setValues.size!=newMap.size)
        println(false)
    else println(true)
}

val arr = listOf<Int>(1, 2,2, 2, 1, 1, 3)
var isSame = true
val newMap = arr.groupBy { it }.mapValues { it.value.size }.values.toList()
val setValues = arr.groupBy { it }.mapValues { it.value.size }.values.toSet()


