fun main() {
    val strs = arrayOf("eat", "tea", "tan", "ate", "nat", "bat", "ad", "bc")
    val list = groupAnagrams(strs)
    println(list)
}

fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val result = mutableMapOf<Int, MutableList<String>>()
    strs.forEach {
        val hashCode = it.toCharArray().sorted().hashCode()
        val list = result.getOrPut(hashCode) { mutableListOf() }
        list.add(it)
    }
    return result.values.toList()
}
