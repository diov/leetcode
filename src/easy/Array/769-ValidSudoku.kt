fun main() {
    val row1 = charArrayOf('5', '3', '.', '.', '7', '.', '.', '.', '.')
    val row2 = charArrayOf('6', '.', '.', '1', '9', '5', '.', '.', '.')
    val row3 = charArrayOf('.', '9', '8', '.', '.', '.', '.', '6', '.')
    val row4 = charArrayOf('8', '.', '.', '.', '6', '.', '.', '.', '3')
    val row5 = charArrayOf('4', '.', '.', '8', '.', '3', '.', '.', '1')
    val row6 = charArrayOf('7', '.', '.', '.', '2', '.', '.', '.', '6')
    val row7 = charArrayOf('.', '6', '.', '.', '.', '.', '2', '8', '.')
    val row8 = charArrayOf('.', '.', '.', '4', '1', '9', '.', '.', '5')
    val row9 = charArrayOf('.', '.', '.', '.', '8', '.', '.', '7', '9')

    val board = arrayOf(row1, row2, row3, row4, row5, row6, row7, row8, row9)
    println(isValidSudoku(board))
}

fun isValidSudoku(board: Array<CharArray>): Boolean {
    val rows = Array(9) { IntArray(9) }
    val colums = Array(9) { IntArray(9) }
    val matrixs = Array(9) { IntArray(9) }

    for (x in 0..8) {
        for (y in 0..8) {
            val value = board[x][y]
            if (value == '.') continue
            val valueInt = value.toString().toInt() - 1

            val matrixNumber = x / 3 * 3 + y / 3
            if (rows[y][valueInt] == 1 || colums[x][valueInt] == 1 || matrixs[matrixNumber][valueInt] == 1) {
                return false
            }
            rows[y][valueInt] = 1
            colums[x][valueInt] = 1
            matrixs[matrixNumber][valueInt] = 1
        }
    }
    return true
}
