import java.util.concurrent.ThreadLocalRandom
import kotlin.math.floor

val nums: IntArray = intArrayOf(1, 2, 3, 4, 5, 6)

fun reset(): IntArray {
    return nums
}

/** Fisher–Yates Shuffle. */
fun shuffle(): IntArray {
    val clone = nums.clone()
    for (i in clone.count() - 1 downTo 0) {
        val index = floor(ThreadLocalRandom.current().nextDouble() * (i + 1)).toInt()
        clone[i] = clone[index].also {
            clone[index] = clone[i]
        }
    }
    return clone
}
