fun main() {
    val nums = intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)
    println(maxSubArray(nums))
}

fun maxSubArray(nums: IntArray): Int {
    if (nums.count() < 2) return nums[0]
    var result = nums[0]
    var current = nums[0]
    for (i in 1 until nums.count()) {
        current = nums[i] + maxOf(0, current)
        result = maxOf(result, current)
    }
    return result
}
