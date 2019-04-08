fun main() {
    val x = 1
    val y = 4
    println(hammingDistance(x, y))
}

fun hammingDistance(x: Int, y: Int): Int {
    var xor = x xor y
    var count = 0
    while (xor > 0) {
        count += xor and 1
        xor = xor shr 1
    }
    return count
}
