import kotlin.random.Random

fun main() {
    button {
        println("Hello")
    }

    button(onClick = {
        println("Hello 2")
    })


   val a= 10
    val b =20
    val sub= { cd:Int, bd:Int -> cd+bd}
    println(sub(a,b))

      button2 { random ->
         println(random)
        "$random"
    }
    val result = mult(3,4)
    println(result)
}

fun button(onClick: () -> Unit) {
    onClick()
}

fun button2(randomString : (Int) -> String){
    randomString(Random.nextInt(from = 0, until = 20))
}

val mult = {x:Int, y:Int -> x*y}



