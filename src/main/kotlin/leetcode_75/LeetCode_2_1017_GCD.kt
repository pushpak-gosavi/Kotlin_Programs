package leetcode_75

fun main(){
    val str1 = "AB"
    val str2="ABABAB"


    println(gcdOfStrings(str1 = str1, str2 = str2))
}

fun gcdOfStrings(str1: String, str2: String): String {
    if(str1.length< str2.length){
        return gcdOfStrings(str2, str1) // return the function if str1 is less than str2
    }
    if (str2.equals(str1)){
        return str1
    }
    if (str1.startsWith(str2)){
        return gcdOfStrings(str1.substring(str2.length), str2)
    }
    return ""
}