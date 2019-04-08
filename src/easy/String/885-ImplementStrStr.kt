fun main(args: Array<String>) {
    val haystack = "a"
    val needle = "a"
    println(strStr(haystack, needle))
}

fun strStr(haystack: String, needle: String): Int {
    val needleSize = needle.count()
    if (needleSize == 0) return 0
    val needleFirst = needle[0]

    haystack.forEachIndexed { index, c ->
        if (c == needleFirst) {
            if (index + needleSize > haystack.count()) {
                return -1
            }
            if (haystack.subSequence(index, index + needleSize) == needle) {
                return index
            }
        }
    }
    return -1
}
