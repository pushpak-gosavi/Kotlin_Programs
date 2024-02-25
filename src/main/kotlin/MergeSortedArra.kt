fun main() {
    val mutableList1 = mutableListOf(1, 2, 3, 0, 0, 0)
    val mutableList2 = mutableListOf(2, 5, 6)
    val m = 3
    val n = 3
    println(mutableList1.filter {
        mutableList1.indexOf(it) < m
    })
    println(mutableList2.filter {
        mutableList2.indexOf(it) < n
    })

    marg(mutableList1,m,mutableList2,n)
}

fun marg(mutableList1: MutableList<Int>, m: Int, mutableList2: MutableList<Int>, n: Int): List<Int> {
    val a = mutableList1.filter { mutableList1.indexOf(it) < m }.toMutableList() +
        mutableList2.filter { mutableList2.indexOf(it) < n }.toMutableList()
    println(a)

    return a.sorted()
}