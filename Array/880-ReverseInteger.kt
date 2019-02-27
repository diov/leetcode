import kotlin.math.absoluteValue
import java.lang.Math.pow

fun main(args: Array<String>) {
	val x = -2147483648
	val reverse = Solution().reverse(x)
	println(reverse)
}

class Solution {
	fun reverse(x: Int): Int {
		val value = x.toLong().absoluteValue

		val valueString = value.toString()
		println(valueString)
		var reverseValue = 0L
		for (i in 0 until valueString.count()) {
			val digit = valueString[i].toString().toInt()
			val y = pow(10.0, i.toDouble()).toLong()
			reverseValue += digit * y
		}

		if (reverseValue > Int.MAX_VALUE) {
			return 0
		} else {
			return if (x > 0 ) reverseValue.toInt() else reverseValue.toInt() * -1
		}
	}
}
