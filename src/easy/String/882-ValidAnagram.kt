fun main(args: Array<String>) {
    val s = "anagram"
    val t = "nagaram"
    println(isAnagram(s, t))
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.count() != t.count()) return false
    val charArray = IntArray(26)
    for (i in 0 until s.count()) {
        charArray[s[i] - 'a']++
        charArray[t[i] - 'a']--
    }
    return !charArray.any { it > 0 }
}
