fun main() {
    val matrix = arrayOf(
            intArrayOf(1, 0, 1)
    )
    setZeroes(matrix)
    matrix.printlnMatrix()
}

fun setZeroes(matrix: Array<IntArray>): Unit {
    var rowZero = false
    var columnZero = false
    for (i in 0 until matrix.count()) {
        for (j in 0 until matrix[i].count()) {
            if (matrix[i][j] == 0) {
                if (i == 0) {
                    rowZero = true
                }
                if (j == 0) {
                    columnZero = true
                }
                matrix[i][0] = 0
                matrix[0][j] = 0
            }
        }
    }

    for (i in 1 until matrix.count()) {
        for (j in 1 until matrix[i].count()) {
            if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                matrix[i][j] = 0
            }
        }
    }

    if (rowZero) {
        matrix[0].fill(0)
    }
    if (columnZero) {
        matrix.forEach {
            it[0] = 0
        }
    }
}
