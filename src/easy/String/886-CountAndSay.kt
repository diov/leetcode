fun main() {
    val n = 5
    println(countAndSay(n))
}

fun countAndSay(n: Int): String {
    if (n == 1) {
        return "1"
    }
    val previousResult = countAndSay(n - 1)
    val builder = StringBuilder()
    var count = 0
    var currentChar: Char? = null
    previousResult.forEach { c ->
        if (currentChar == c) {
            count++
        } else {
            currentChar?.let {
                builder.append(count).append(it)
            }
            currentChar = c
            count = 1
        }
    }
    currentChar?.let {
        builder.append(count).append(it)
    }
    return builder.toString()
}
