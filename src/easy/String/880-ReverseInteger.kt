import java.lang.Math.pow
import kotlin.math.absoluteValue

fun main() {
    val x = -2147483648
    val reverse = reverse(x)
    println(reverse)
}

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

    return if (reverseValue > Int.MAX_VALUE) {
        0
    } else {
        if (x > 0) reverseValue.toInt() else reverseValue.toInt() * -1
    }
}
