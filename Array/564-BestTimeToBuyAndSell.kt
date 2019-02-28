fun main(args: Array<String>) {
    val prices = intArrayOf(1)
    print(Solution().maxProfit(prices))
}

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var count = 0
        for (index in 1 until prices.count()) {
            if (prices[index] > prices[index - 1]) {
                count += prices[index] - prices[index - 1]
            }
        }
        return count
    }
}
