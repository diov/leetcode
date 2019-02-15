import java.util.Arrays

fun main(args: Array<String>) {
	val array = intArrayOf(1,2,3,4,5,6,7)
	Solution().rotate(array, 3)
	val content = Arrays.toString(array)
	print(content)
}

class Solution {
	fun rotate(nums: IntArray, k: Int): Unit {
		var temp: Int
		val count = nums.count()
		if (count < 2) return
		for (i in 0 until k) {
			temp = nums[count - 1]
			for (index in count - 1 downTo 1) {
				nums[index] = nums[index - 1]
			}
			nums[0] = temp
		}
	}
}