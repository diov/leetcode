fun main() {
    val array = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5)
    )
    array.printlnMatrix()
    rotate(array)
    array.printlnMatrix()
}

fun rotate(matrix: Array<IntArray>) {
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
