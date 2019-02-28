import java.util.Arrays

fun main(args: Array<String>) {
    val array = intArrayOf(1,2,3)
    val content = Arrays.toString(Solution().plusOne(array))
    print(content)	
}

class Solution {
    fun plusOne(digits: IntArray): IntArray {
        val count = digits.count()

        for (i in count - 1 downTo 0) {
            val plusDigit = digits[i] + 1
            if (plusDigit >= 10) {
                digits[i] = 0
                continue
            } else {
                digits[i] = plusDigit
                break
            }
        }

        if (digits[0] == 0) {
            return intArrayOf(1).plus(digits)
        } else {
            return digits
        }
    }
}
