fun main() {
    val s = "MCMXCIV"
    println(romanToInt(s))
}

fun romanToInt(s: String): Int {
    val count = s.count()
    val array = IntArray(count) { 0 }
    s.forEachIndexed { index, c ->
        when (c) {
            'I' -> array[index] = 1
            'V' -> array[index] = 5
            'X' -> array[index] = 10
            'L' -> array[index] = 50
            'C' -> array[index] = 100
            'D' -> array[index] = 500
            'M' -> array[index] = 1000
            else -> throw Exception("Unsupported char")
        }
    }

    var result = 0
    for (i in 0 until count) {
        if (i == count - 1) {
            result += array[i]
        } else {
            if (array[i] < array[i + 1]) {
                result -= array[i]
            } else {
                result += array[i]
            }
        }
    }
    return result
}
