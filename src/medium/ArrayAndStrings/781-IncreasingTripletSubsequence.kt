fun main() {
    val nums = intArrayOf(1, 1, 1)
    println(increasingTriplet(nums))
    println(increasingTriplet2(nums))
}

fun increasingTriplet(nums: IntArray): Boolean {
    for (i in 0 until nums.count()) {
        val first = nums[i]
        var previous = nums[i]
        var count = 1
        for (j in i + 1 until nums.count()) {
            if (nums[j] > previous) {
                count++
                previous = nums[j]
                if (count >= 3) {
                    return true
                }
            } else {
                if (nums[j] > first) {
                    previous = nums[j]
                }
            }
        }
    }
    return false
}

fun increasingTriplet2(nums: IntArray): Boolean {
    var first = Int.MAX_VALUE
    var second = Int.MAX_VALUE

    for (num in nums) {
        when {
            num <= first -> first = num
            num <= second -> second = num
            else -> return true
        }
    }
    return false
}
