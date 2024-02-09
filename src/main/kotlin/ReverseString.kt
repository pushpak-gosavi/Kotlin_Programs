
fun main(){
    val name  = "My Name is Pushpak"
    var reversString=""
    for (i in name.length-1 downTo 0){
        reversString+=name[i]
    }
    println(reversString)
}