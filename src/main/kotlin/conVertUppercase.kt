
fun main(){
    val name="Pushpak Gosavi"
    var newString=""
    for (i in name){
        if (i.isUpperCase())
            newString+= i.lowercaseChar()
        else if (i.isLowerCase())
            newString+= i.uppercaseChar()
        else if(i==' ')
            newString+=' '
    }
    println(name)
    println(newString)
}