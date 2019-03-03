fun main(args: Array<String>) {
    val s = "9223372036854775808"
    println(Solution().myAtoi(s))
}

class Solution {
    fun myAtoi(str: String): Int {
        val trimStr = str.trim()
        var result = 0.0
        var positive = true
        for (index in 0 until trimStr.count()) {
            val c = trimStr[index]
            if (index == 0 && c == '+') {
                positive = true
                continue
            } else if (index == 0 && c == '-') {
                positive = false
                continue
            } else if (c >= '0' && c <= '9') {
                result = result * 10 + (c - '0')
            } else {
                break
            }
        }
        println(result)
        if (result > Int.MAX_VALUE) {
            return if (positive) Int.MAX_VALUE else Int.MIN_VALUE
        } else {
            return if (positive) result.toInt() else result.toInt() * -1
        }
    }
}
