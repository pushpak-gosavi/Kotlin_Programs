
sealed class VehicalOne{
    companion object{
        fun getSame()="Helloooo"
    }
}

data class CarOne(
    val manufacture:String,
    val name:String
):VehicalOne()

data class VealherTwo(
    val price:Int
):VehicalOne()


fun getData(vehical: VehicalOne):String=
    when(vehical){
        is CarOne -> "${vehical.manufacture} is ${vehical.name}"
        is VealherTwo -> "${vehical.price}"
    }

fun main(){
    val vehicalOne:VehicalOne = CarOne("Pushpak", name = "Strong")
    getData(vehicalOne)
    println(getData(vehicalOne))
    println(VehicalOne.getSame())
    println(Pushpak.Value)

    val number = 10

    lamda2 {
        println("Helooo $it")
    }
}

enum class Pushpak {
    Value,
    Value2
}


fun lamda2(onclickLamda:(Int)->Unit){
    onclickLamda(10)
}