import kotlin.math.floor
import kotlin.math.log10

fun main() {
    val n = 14348907
    println(isPowerOfThree3(n))
}

fun isPowerOfThree1(n: Int): Boolean {
    if (n <= 0) return false
    return (1162261467 % n) == 0
}

fun isPowerOfThree2(n: Int): Boolean {
    var m = n
    while (m > 0 && m % 3 == 0) {
        m /= 3
    }
    return m == 1
}

// If use log2, 14348907 will return false
fun isPowerOfThree3(n: Int): Boolean {
    val r = log10(n.toDouble()) / log10(3.0)
    println(r)
    return r == floor(r)
}
