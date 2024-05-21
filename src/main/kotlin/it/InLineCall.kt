package it

fun main() {
    callDemo("Hello")
    callDemo("World")
}

private fun String.demo(): String {
    return "/s $this /s"
}

private fun callDemo(str: String) {
    println("demo calling")
    println(str.demo())
}