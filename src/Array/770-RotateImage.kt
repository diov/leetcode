fun main() {
    val array = arrayOf(
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5),
            intArrayOf(1, 2, 3, 4, 5)
    )
    twoDemissionalPrint(array)
    rotate(array)
    twoDemissionalPrint(array)
}

fun twoDemissionalPrint(matrix: Array<IntArray>) {
    matrix.forEach { it.printContent() }
}

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
