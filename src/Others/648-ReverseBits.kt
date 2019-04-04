fun main() {
    val n = -3
    println(reverseBits(n))
}

fun reverseBits(n: Int): Int {
    var origin = n
    var result = 0
    for (i in 1..32) {
        val lastBit = origin and 1
        result = (result shl 1) + lastBit
        origin = origin ushr 1
    }
    return result
}
