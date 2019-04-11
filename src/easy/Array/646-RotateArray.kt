fun main() {
    val array = intArrayOf(1, 2, 3, 4, 5, 6, 7)
    rotate(array, 3)
    array.printContent()
}

fun rotate(nums: IntArray, k: Int) {
    var temp: Int
    val count = nums.count()
    if (count < 2) return
    for (i in 0 until k) {
        temp = nums[count - 1]
        for (index in count - 1 downTo 1) {
            nums[index] = nums[index - 1]
        }
        nums[0] = temp
    }
}
