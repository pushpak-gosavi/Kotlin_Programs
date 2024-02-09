import kotlin.math.max

fun main(){
    val givenName ="My name is Akash Patil I am from kolhapur"
    val hashMap = HashMap<String, String>()
    var highestString=""
    var count =0

    val newlySplitString = givenName.split(" ")
    for(i in newlySplitString){
        if(count < i.length){
            count = i.length
            highestString = i
        }
    }
    println(newlySplitString)
    println("$highestString is the higest String and count of char is $count")
    /*var newString =""
    for(i in givenName){
        for (j in givenName.indices){
            if(givenName.get(j) != ' ')
                newString +=givenName[j]
            else {
                    hashMap["$newString"] = newString
                    newString=""
                }
        }
    }
    var count = 0
    var string = ""
    var newHashMap = mutableMapOf<String, Int>()
    for (i in hashMap){
           newHashMap[i.key] = newHashMap.getOrDefault(i.key, i.value.length)
           if(count < newHashMap[i.value]!!){
               count = newHashMap[i.value]!!
               string = newHashMap[i.key].toString()
           }
    }
    println(newHashMap)

    println("$string is the longest String and length is $count")


    println(hashMap)
    println(newHashMap)

    println(string)
    println(count)*/
}