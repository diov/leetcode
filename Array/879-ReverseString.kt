fun main(args: Array<String>) {
	val array = charArrayOf('h', 'e', 'l', 'l', 'o')
	Solution().reverseString(array)
	println(array)
}

class Solution {
	fun reverseString(s: CharArray): Unit {
		val size = s.count()
		for (i in 0 until size / 2) {
			s[i] = s[size - 1 - i].also { s[size - 1 - i] = s [i] }
		}
	}
}