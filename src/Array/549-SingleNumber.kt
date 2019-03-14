fun main() {
    val array = intArrayOf(4, 1, 2, 1, 2, 3, 3)
    println(singleNumber(array))
}

fun singleNumber(nums: IntArray): Int {
    var result = 0
    nums.forEach {
        result = result xor it
    }
    return result
}
