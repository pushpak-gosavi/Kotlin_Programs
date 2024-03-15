fun main(){
    val name = "push1pakh1"
    var charList = mutableListOf<Char>()
   /* for (i in name.indices){
        charList.add(index = i, name[i])
    }
    var count=0
    for (i in charList){
        for (j in charList.indices){
            if(i.lowercaseChar().equals(charList[j].lowercaseChar())){
               count++
            }
        }
        println("$i repetated $count times")
        count =0

    }*/

    val charCountMap = mutableMapOf<Char, Int>()
    for (char in name){
            charCountMap[char] = charCountMap.getOrDefault(char, 0)+1
    }

    //
//    if(charCountMap.containsKey(char)){
//        var a = charCountMap.get(char)
//        ++a;
//        charCountMap.put(char, a);
//    }else{
//        charCountMap.put(char, 1)
//    }
    //


    for(i in charCountMap){
        println("char: ${i.key} count :  ${i.value}")
    }

//    println(charCountMap.get(key = 'p'))
//    charCountMap['p'] = 7
//    println(charCountMap.get(key = 'p'))


    println(charCountMap)

    val newCount = name.groupBy { it }.mapValues { it.value.size }
    println(newCount)
    for ((key, value) in newCount){
        println("$key is repated $value time")
    }

    val newMap = mutableMapOf<Char, Int>()
    for (char in name) {
        newMap[char] = newMap.getOrDefault(char, 0) + 1
    }
    println(newMap)
}