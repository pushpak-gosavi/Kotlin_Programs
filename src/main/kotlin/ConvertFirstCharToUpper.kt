import java.util.*
import javax.lang.model.element.Name
import kotlin.math.max

fun main(){
    val name= "hello world"
    /**
     * Convert first char to uppercaase
     */
    /*val listName= name.split(' ')
    var upperName=""
    println(listName)
    for (i in listName){
        for (j in i.indices) {
            if(j==0)
                upperName += i[j].uppercase(Locale.getDefault())
            else upperName += i[j]
        }
        upperName+=" "
    }

    println(upperName)*/
    /**
     * Count duplicate from string
     */

    /*val count = name.groupBy { it }.mapValues { it.value.size }

    println(count)

    val map = mutableMapOf<Char, Int>()
    for(char in name){
        map[char] = map.getOrDefault(char,0)+1
    }
    println(map)*/

    /**
     * calculate the highest and second highest number from list
     */

    /*val numberList= listOf(3,5,-1,8,10,7,6,9,4,1,8)
    var maxNumber = Int.MIN_VALUE
    var secondMaxNumber= Int.MIN_VALUE
    for (i in numberList){
        if (maxNumber <= i) {
            //secondMaxNumber = maxNumber
            maxNumber = i
        }
        else if(i in secondMaxNumber..maxNumber)
            secondMaxNumber=i
    }
    println(maxNumber)
    println(secondMaxNumber)*/

    /**
     * compare the boject from the list in assending orrder by name
     */
    val listNameAge= listOf<NameAge>(
        NameAge(name="Pushpak", 30),
        NameAge(name="Ayushi", age = 29),
        NameAge(name="Zebra", age = 20)
    )

    println(listNameAge)
    val comp = listNameAge.sortedBy { it.name }
    val assName= listNameAge.sortedWith(compareBy<NameAge> { it.name }.thenByDescending { it.age })
    println(assName)
    println(comp)
}

data class NameAge(
    val name: String,
    val age: Int
)