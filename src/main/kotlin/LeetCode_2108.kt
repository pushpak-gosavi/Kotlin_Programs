fun main(){
    val listPalindrom = listOf("def","ghi")
    for (i in listPalindrom){
        if (getpalidrom(i)) {
                println(i)
            break
            }
    }
}

fun getpalidrom(string: String):Boolean{
    var i = 0
    var j= string.length-1
    var result = true
    while (i < j){
        if(string[i] != string[j]){
            result = false
            break
        }
        i++
        j--
    }
    return result
}