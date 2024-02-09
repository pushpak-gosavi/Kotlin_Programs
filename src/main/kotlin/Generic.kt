
fun main(){
    val firstList = listOf<Int>(1,2,3,4,1,2)
    println(thisIsGeneric(firstList))
    val nameList = listOf<String>("push", "Akash", "push", "Sangram")
    println(thisIsGeneric(nameList))

    button1 {
        println("On Click")
    }

    button (onClick = {
        println("Pushpak")
    })

    val car1 = Car(tires = Tires(size = 17))
    val car2 = Car(tires = 17)
    val car3 = Car(tires = "16")
    println(car1.getValues())
    println(car2.getValues())
    println(car3.getValues())

    val checkAny = Vehical(vehicalType = VehicalStart())
    val checkCar = checkAny.getVehical()
    //checkAny.start() we can not able to access the start method by using the Any type
    // Any is the Universal type class
}
fun <T> thisIsGeneric(list:List<T>):List<T>{
    val seen = HashSet<T>()
    val duplicate = HashSet<T>()
    for (item in list){
        if (!seen.add(item))
            duplicate.add(item)
    }
    return duplicate.toList()
}

fun button1(onClick:() -> Unit){
    onClick()
}


data class Tires(val size:Int)

class Car<T>(private val tires: T){
    fun getValues():T= tires
}

class Vehical(private val vehicalType:Any){
    fun getVehical() = vehicalType
}

class VehicalStart{
    fun start() = "Car is Start"
}