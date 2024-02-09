fun main(){
    val name = "Pushpak"
    println(name.isLongOrShor)

    val listNumber = listOf<Int>(2,3,4,5,3,4,3)
    val nameList = listOf<String>("Push", "Sang", "Push", "Akash")
    println(listNumber.getFirst)
    val lsitEmpty = listOf<Int>()
    println(lsitEmpty.getFirst)

    listNumber.getTheCountNull(3)
    nameList.getTheCountNull("push")
}

val String.isLongOrShor:String
    get() = if (this.length > 10) "Long" else "Short"

val <T> List<T>.getFirst: T?
    get() = if (isEmpty()) null else first()

fun <T> List<T>.getTheCountNull(number: T){
    var count=0
    if (!this.contains(number))
        println("$number not found in in $this")
    else {
        for(i in this){
            if(i == number)
                count++
        }
        println("$number is repeate $count times")
    }

}