fun main(){
    val name="MyNameIsPushpak"
    var newName=""
    for(i in name){
        if (i.isUpperCase()){
            newName= "$newName $i"
        }else
            newName += i
    }

    println(newName)

}