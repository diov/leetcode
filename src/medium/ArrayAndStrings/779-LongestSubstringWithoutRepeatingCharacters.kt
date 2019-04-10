fun main() {
    val s = "abcabcbb"
//    val s = "abba"
//    val s = "pwwkew"
    println(lengthOfLongestSubstring1(s))
    println(lengthOfLongestSubstring2(s))
}

fun lengthOfLongestSubstring1(s: String): Int {
    if (s.count() < 2) return s.count()
    val stringArray = Array(s.count()) { "" }
    stringArray[0] = s.substring(0 until 1)
    for (i in 1 until s.count()) {
        val c = s[i]
        val previous = stringArray[i - 1]
        if (previous.contains(c)) {
            stringArray[i] = previous.substring(previous.lastIndexOf(c) + 1) + c
        } else {
            stringArray[i] = stringArray[i - 1] + c
        }
    }
    stringArray.printContent()
    return stringArray.map { it.count() }.max() ?: 0
}

fun lengthOfLongestSubstring2(s: String): Int {
    if (s.count() < 2) return s.count()
    var headIndex = -1
    var length = 0
    val map = mutableMapOf<Char, Int>()
    s.forEachIndexed { index, c ->
        val previous = map.getOrDefault(c, headIndex)
        headIndex = maxOf(previous, headIndex)
        length = maxOf(length, index - headIndex)
        map[c] = index
    }
    return length
}