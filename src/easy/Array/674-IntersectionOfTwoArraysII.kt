import kotlin.math.min

fun main() {
    val nums1 = intArrayOf(4, 9, 5)
    val nums2 = intArrayOf(9, 4, 9, 8, 4)
    intersect(nums1, nums2).printContent()
}

fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
    nums1.sort()
    nums2.sort()

    var i = 0
    var j = 0
    val list = ArrayList<Int>(min(nums1.count(), nums2.count()))
    while (i < nums1.count() && j < nums2.count()) {
        when {
            nums1[i] < nums2[j] -> i++
            nums1[i] > nums2[j] -> j++
            else -> {
                list.add(nums1[i])
                i++
                j++
            }
        }
    }
    val size = min(i, j)
    return list.take(size).toIntArray()
}
