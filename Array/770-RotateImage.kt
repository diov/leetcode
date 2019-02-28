import java.util.Arrays
import kotlin.math.ceil

fun main(args: Array<String>) {
    val array = arrayOf(intArrayOf(1,2,3,4,5), intArrayOf(1,2,3,4,5), intArrayOf(1,2,3,4,5), intArrayOf(1,2,3,4,5), intArrayOf(1,2,3,4,5))
    twoDemisionalPrint(array)
    Solution().rotate(array)
    twoDemisionalPrint(array)
}

fun twoDemisionalPrint(matrix: Array<IntArray>) {
    for (line in matrix) {
        val content = Arrays.toString(line)
        println(content)
    }
}

class Solution {
    fun rotate(matrix: Array<IntArray>): Unit {
        val size = matrix.size
        val maxIndex = size - 1
        for (i in 0 until size / 2) {
            for (j in i until maxIndex - i) {
                val temp = matrix[i][j]
                matrix[i][j] = matrix[maxIndex - j][i]
                matrix[maxIndex - j][i] = matrix[maxIndex - i][maxIndex - j]
                matrix[maxIndex - i][maxIndex - j] = matrix[j][maxIndex - i]
                matrix[j][maxIndex - i] = temp
            }
        }
    }
}
