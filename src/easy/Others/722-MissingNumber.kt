fun main() {
    val nums = intArrayOf(9, 6, 4, 2, 3, 5, 7, 0, 1)
    println(missingNumber(nums))
}

fun missingNumber(nums: IntArray): Int {
    var result = nums.count() * (nums.count() + 1) / 2
    nums.forEach {
        result -= it
    }
    return result
}
