fun main() {
    val step = climbStairsBottomUp2(10)
    println(step)
}

// Top-Down
fun climbStairsTopDown(n: Int): Int {
    fun climbStairs(n: Int, stepArray: IntArray): Int {
        if (stepArray[n] < 0) {
            stepArray[n] = climbStairs(n - 1, stepArray) + climbStairs(n - 2, stepArray)
        }
        return stepArray[n]
    }

    if (n == 1) return 1
    val stepArray = IntArray(n) {
        when (it) {
            0 -> 1
            1 -> 2
            else -> -1
        }
    }
    return climbStairs(n - 1, stepArray)
}

// Bottom-Up with array
fun climbStairsBottomUp1(n: Int): Int {
    if (n == 1) return 1
    val stepArray = IntArray(n) {
        when (it) {
            0 -> 1
            1 -> 2
            else -> -1
        }
    }
    for (i in 2 until n) {
        stepArray[i] = stepArray[i - 1] + stepArray[i - 2]
    }
    return stepArray[n - 1]
}

// Bottom-Up with two variable
fun climbStairsBottomUp2(n: Int): Int {
    if (n == 1) return 1
    var twoStepPrevious = 1
    var oneStepPrevious = 2
    for (i in 2 until n) {
        oneStepPrevious += twoStepPrevious.also {
            twoStepPrevious = oneStepPrevious
        }
    }
    return oneStepPrevious
}
