
fun main(){
    val name="Pushpak Gosavi"
    var newString=""
    for (i in name){
        if (i.isUpperCase())
            newString+=i.toLowerCase()
        else if (i.isLowerCase())
            newString+=i.toUpperCase()
        else if(i==' ')
            newString+=' '
    }
    println(name)
    println(newString)
}