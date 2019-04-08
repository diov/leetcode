fun main() {
    println(fizzBuzz(15))
}

fun fizzBuzz(n: Int): List<String> {
    val result = ArrayList<String>(n)
    for (i in 1..n) {
        when {
            i % 15 == 0 -> {
                result.add("FizzBuzz")
            }
            i % 3 == 0 -> {
                result.add("Fizz")
            }
            i % 5 == 0 -> {
                result.add("Buzz")
            }
            else -> result.add(i.toString())
        }
    }
    return result
}
