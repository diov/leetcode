fun main(args: Array<String>) {
    val s = "loveleetcode"
    println(firstUniqChar(s))
}

fun firstUniqChar(s: String): Int {
    val map = hashMapOf<Char, Int>()
    s.forEach { c ->
        map[c] = map.getOrElse(c) { 0 } + 1
    }
    s.forEachIndexed { index, c ->
        if (map[c] == 1) {
            return index
        }
    }
    return -1
}
