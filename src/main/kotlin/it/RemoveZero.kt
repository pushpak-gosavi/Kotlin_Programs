package it

fun main() {
    val numbers = mutableListOf(1, 2, 0, 3, 0, 4, 5, 0)

    val countNumberofZeros = numbers.size - numbers.filter { it != 0 }.size

    println(countNumberofZeros)

    numbers.removeAll { it == 0 }

    repeat(countNumberofZeros) {
        numbers.add(0)
    }

    println(numbers)

    val numsArray = intArrayOf(0, 1, 0, 3, 12)
    println(moveZero(numsArray).contentToString())
}

private fun moveZero(nums: IntArray): IntArray {
    var insertPos = 0
    nums.forEach { num ->
        if (num != 0) {
            nums[insertPos] = num
            insertPos++
        }
    }
    for (i in insertPos until nums.size) {
        nums[i] = 0
    }
    //println(nums) -> here print the array object not the content element
    return nums
}