fun main() {
    val array = charArrayOf('h', 'e', 'l', 'l', 'o')
    reverseString(array)
    println(array)
}

fun reverseString(s: CharArray) {
    val size = s.count()
    for (i in 0 until size / 2) {
        s[i] = s[size - 1 - i].also { s[size - 1 - i] = s[i] }
    }
}
