fun main() {
    val list = generate2(5)
    list.forEach(::println)
}

fun generate(numRows: Int): List<List<Int>> {
    fun generateSubList(list: MutableList<List<Int>>, index: Int) {
        val previousList = list[index - 1]
        val currentList = mutableListOf<Int>()
        currentList.add(1)
        for (i in 0 until previousList.count() - 1) {
            currentList.add(previousList[i] + previousList[i + 1])
        }
        currentList.add(1)
        list.add(currentList)
    }

    return when (numRows) {
        0 -> emptyList()
        1 -> listOf(listOf(1))
        2 -> listOf(listOf(1), listOf(1, 1))
        else -> {
            val result = ArrayList<List<Int>>(numRows)
            result.add(listOf(1))
            result.add(listOf(1, 1))
            for (i in 2 until numRows) {
                generateSubList(result, i)
            }
            return result
        }
    }
}

fun generate2(numsRows: Int): List<List<Int>> {
    val result = ArrayList<List<Int>>(numsRows)
    val currentList = mutableListOf<Int>()
    for (i in 0 until numsRows) {
        currentList.add(0, 1)
        for (j in 1 until currentList.count() - 1) {
            currentList[j] += currentList[j + 1]
        }
        result.add(ArrayList<Int>(currentList))
    }
    return result
}
