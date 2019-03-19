fun main() {
    val array = intArrayOf(1, 2, 9)
    plusOne(array).printContent()
}

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

    return if (digits[0] == 0) {
        intArrayOf(1).plus(digits)
    } else {
        digits
    }
}
