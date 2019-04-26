fun main() {
    val s = ""
    println(longestPalindrome(s))
}


fun longestPalindrome(s: String): String {
    if (s.count() < 2) return s.substring(0 until s.count())
    var max = s[0].toString()
    for (i in 1 until s.count()) {
        var j = i
        var k = i
        while (j >= 0 && k <= s.count() - 1) {
            if (s[j] == s[k]) {
                j--
                k++
            } else {
                break
            }
        }
        val max1 = s.substring(j + 1 until k)
        j = i - 1
        k = i
        while (j >= 0 && k <= s.count() - 1) {
            if (s[j] == s[k]) {
                j--
                k++
            } else {
                break
            }
        }
        val max2 = s.substring(j + 1 until k)
        max = arrayOf(max, max1, max2).maxBy { it.count() }!!
    }
    return max
}
