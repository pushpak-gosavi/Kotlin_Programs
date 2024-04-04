package leetcode_daily

fun main(){
    val givenString = "(1+(2*3)+((8)/4))+1"
    var count=0
    var maxDepth=0
    for (i in givenString){
        if (i=='(')
            count ++
        else if (i==')')
            count--

        maxDepth = maxOf(maxDepth, count)
    }
    print(maxDepth)
}