package leetcode_daily

fun main(){
    val first = "abcdef"
    val ch = 'g'
    var subStr =""
    var revString=""
    for (i in first){
//        if (i !=ch)
//            subStr+=i
//        else  {
//            revString = "$ch${subStr.reversed()}${first.substring(first.indexOf(i)+1)}"
//            break
//        }
        if (i==ch) {
            revString = "$ch${
                first.substring(startIndex = 0, endIndex = first.indexOf(ch)).reversed()
            }${first.substring(first.indexOf(ch) + 1)}"

            break
        }
        else revString+=i

    }

    println(revString)
}