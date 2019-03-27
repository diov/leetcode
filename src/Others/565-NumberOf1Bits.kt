fun hammingWeight(n: Int): Int {
    return when {
        n < 2 -> n
        else -> {
            (n and 1) + hammingWeight(n ushr 1)
        }
    }
}
