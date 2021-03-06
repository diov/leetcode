fun main() {
    val array = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    val length = removeDuplicates(array)
    array.sliceArray(IntRange(0, length - 1)).printContent()
}

fun removeDuplicates(nums: IntArray): Int {
    val count = nums.count()
    if (count < 2) return count

    var result = 0
    for (index in 1 until nums.count()) {
        if (nums[index] != nums[index - 1]) {
            result++
            nums[result] = nums[index]
        }
    }
    return result + 1
}
