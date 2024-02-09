fun main(){
    val name  = "PushhsuPa"
    var i =0
    var j = name.length-1
    var result = true

    while (i<j){
        if(name[i] != name[j]){
            result = false
            break
        }
        i++
        j--
    }

    if(result)
        println("$name is Panindrom")
    else println("$name is not Palindrom")

}