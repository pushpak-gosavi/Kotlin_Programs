fun main(){
    val line = " luffy is still joyboy"
    val splitLne = line.split(" ")
    println(splitLne)
    for (j in splitLne.size-1 downTo 0){
        if (splitLne[j].isNotEmpty()){
            val x = splitLne[j].length
            println(x)
            break
        }
    }
}