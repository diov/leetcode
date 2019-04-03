import kotlin.math.sqrt

fun main() {
    val n = 10
    println(countPrimes2(n))
}

// [Sieve of Eratosthenes](https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes)
fun countPrimes1(n: Int): Int {
    if (n < 3) return 0

    val array = IntArray(n) { 1 }
    array[0] = 0
    for (i in 2..sqrt(n.toFloat()).toInt()) {
        if (array[i - 1] == 0) continue
        for (j in i*i..n step i) {
            array[j - 1] = 0
        }
    }
    return array.sum() - array[array.count() - 1]
}

fun countPrimes2(n: Int): Int {
    if (n < 3) return 0

    val array = BooleanArray(n) { true }
    for (i in 2..sqrt(n.toFloat()).toInt()) {
        if (!array[i]) continue
        for (j in i*i until n step i) {
            array[j] = false
        }
    }
    var result = 0
    for (i in 2 until n) {
        if (array[i]) result++
    }
    return result
}
