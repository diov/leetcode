fun main() {
    val nums = intArrayOf(2, 7, 1, 3, 10, 1)
    println(robBottomUp(nums))
}

// Top-Down
fun robTopDown(nums: IntArray): Int {
    if (nums.count() < 3) return nums.max() ?: 0
    val prices = IntArray(nums.count()) { 0 }
    prices[0] = nums[0]
    prices[1] = maxOf(nums[0], nums[1])

    for (i in 2 until nums.count()) {
        prices[i] = maxOf(nums[i] + prices[i - 2], prices[i - 1])
    }
    return prices.last()
}

fun robBottomUp(nums: IntArray): Int {
    var previousPrice = 0
    var currentPrice = 0
    nums.forEach { num ->
        previousPrice = currentPrice.also {
            currentPrice = maxOf(previousPrice + num, currentPrice)
        }
    }
    return currentPrice
}
