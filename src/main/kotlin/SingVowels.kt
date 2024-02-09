fun main(){

    var name = "book"
    //println(sameVowels(name=name))
    println(scopeFunThrough(name= name))



}

val vowels = charArrayOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')

fun sameVowels(name:String):Boolean{
    var firstCount =0
    var secondCount =0
    for (i in 0 until name.length/2){
        if(vowels.contains(name[i])){
            firstCount++
        }
    }
    println(firstCount)

    for (j in name.length/2 until name.length){
        if (vowels.contains(name[j])){
            secondCount++
        }
    }
    println(secondCount)
    return firstCount == secondCount
}

fun scopeFunThrough(name:String) : Boolean{
    return name.substring(startIndex = 0, endIndex = name.length/2).count { it in vowels } == name.substring(startIndex = name.length/2, endIndex = name.length).count{it in vowels}
}