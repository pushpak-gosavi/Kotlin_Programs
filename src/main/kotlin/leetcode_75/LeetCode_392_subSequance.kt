package leetcode_75

fun main(){
    val s = "abc"
    val t = "ahbgdc"

    println(subSequnace(s,t))

    val s1 = "axc"; val t1 = "ahbgdc"
    println(subSequnace(s1,t1))


}

private fun subSequnace(s:String, t:String) : Boolean{
    //var match = true
    /*var count =0
    var matchCunt =0
    for (i in s){
        for (j in count until t.length){
            if(i==t[j]){
                count = j
                matchCunt ++
                break
            }
        }
    }
    return matchCunt == s.length*/
    var sIndex =0
    var tIndex=0
    while (sIndex < s.length && tIndex < t.length){
        if (s[sIndex] == t[tIndex])
            sIndex++
        tIndex++
    }
    return sIndex == s.length
}