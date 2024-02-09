fun main() {

    val str = "MCMXCIV"
    println(romanToInt(str))
}



fun romanToInt(s: String) = s.mapIndexed { i, c ->
    c.roman * if ((s.getOrNull(i + 1)?.roman ?: 0) <= c.roman) 1 else -1
}.sum()

private val Char.roman
    get() = when (this) {
        'I' -> 1
        'V' -> 5
        'X' -> 10
        'L' -> 50
        'C' -> 100
        'D' -> 500
        'M' -> 1000
        else -> 0
    }
