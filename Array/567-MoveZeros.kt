import java.util.Arrays

fun main(args: Array<String>) {
	val array = intArrayOf(0,1,0,3,12)
	Solution().moveZeros(array)
	val content = Arrays.toString(array)
	println(content)
}

class Solution {
	fun moveZeros(nums: IntArray): Unit {
		var i = 0
		var j = 0
		while (i < nums.count()) {
			if (nums[i] != 0) {
				nums[i] = nums[j].also { nums[j] = nums[i] }
				j++
			}
			i++
		}
	}
}