package leetcode_daily

import kotlin.math.abs

fun main(){
    val str= "aAbBcC"
    //println(makeGood(str))

//    var str2 = StringBuilder()
//    str2.append(str)
//
    println(makeGood(str))
}
fun makeGood(s: String): String {

    for (i in 0 until s.length-1){
        if (abs(s[i] - s[i+1]) == 32){
            return makeGood("${s.substring(0,i)}${s.substring(i+2, s.length)}")

        }
    }
    return s
}