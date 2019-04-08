import kotlin.math.max

fun main() {
    val prices = intArrayOf(7, 1, 5, 3, 6, 4)
    println(maxProfitStock(prices))
}

fun maxProfitStock(prices: IntArray): Int {
    var result = 0
    if (prices.count() < 2) return result
    var minPrice = prices[0]
    for (i in 1 until prices.count()) {
        val current = prices[i]
        if (current < minPrice) {
            minPrice = current
        } else {
            result = max(result, prices[i] - minPrice)
        }
    }
    return result
}