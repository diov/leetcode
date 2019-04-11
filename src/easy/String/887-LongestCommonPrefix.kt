fun main() {
    val strs = arrayOf("dog", "racecar", "car")
    println(longestCommonPrefix(strs))
}

fun longestCommonPrefix(strs: Array<String>): String {
    val size = strs.map { it.count() }.min() ?: 0
    if (size == 0) return ""
    val builder = StringBuilder()
    for (index in 0 until size) {
        val c = strs[0][index]
        strs.forEach {
            if (it[index] != c) {
                return builder.toString()
            }
        }
        builder.append(c)
    }
    return builder.toString()
}
