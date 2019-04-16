fun main() {
//    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
    val nums = intArrayOf(0, 0, 0, 0)
//    val nums = intArrayOf(-1, 0, 1, 2, -1, -4)
//    val nums = intArrayOf(3, 0, -2, -1, 1, 2)
//    val nums = intArrayOf(-4, -2, -2, -2, 0, 1, 2, 2, 2, 3, 3, 4, 4, 6, 6)
    println(threeSum(nums))
}

fun threeSum(nums: IntArray): List<List<Int>> {
    val count = nums.count()
    if (count < 3) {
        return emptyList()
    }
    val result = mutableListOf<List<Int>>()

    nums.sort()
    var index = 0
    while (index < count) {
        val i = nums[index]
        val sum = -i
        var front = index + 1
        var end = count - 1

        while (end > front) {
            when {
                nums[front] + nums[end] < sum -> front++
                nums[front] + nums[end] > sum -> end--
                else -> {
                    result.add(listOf(i, nums[front], nums[end]))
                    while (end > front && nums[front + 1] == nums[front]) {
                        front++
                    }
                    while (end > front && nums[end - 1] == nums[end]) {
                        end--
                    }
                    front++
                    end--
                }
            }
        }
        while (index + 1 < count && nums[index + 1] == nums[index]) {
            index++
        }
        index++
    }
    return result
}
