var badVersion: Int = -1
fun isBadVersion(version: Int): Boolean {
    return version == badVersion
}

fun main() {
    badVersion = 2
    println(firstBadVersion(5))
}

fun firstBadVersion(n: Int): Int {
    return findBadVersion(0, n.toLong()).toInt()
}

private fun findBadVersion(min: Long, max: Long): Long {
    if (max - min <= 1) return max
    val index = ((min + max) / 2).toInt()
    if (index <= 0) return -1
    return if (!isBadVersion(index)) {
        findBadVersion(index.toLong(), max)
    } else {
        findBadVersion(min, index.toLong())
    }
}
