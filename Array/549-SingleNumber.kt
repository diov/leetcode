fun main(args: Array<String>) {
    val array = intArrayOf(4,1,2,1,2,3,3)
    println(Solution().singleNumber(array))
}

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var result = 0
        nums.forEach {
            result = result xor it
        }
        return result
    }
}