fun main() {
    val nums1 = intArrayOf(1, 2, 3,  0, 0, 0)
    val nums2 = intArrayOf(10, 11, 12)
    merge(nums1, 3, nums2, 3)
    nums1.printContent()
}

fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int): Unit {
    var nums1Index = m - 1
    var nums2Index = n - 1
    while (nums1Index >= 0 && nums2Index >= 0) {
        nums1[nums1Index + nums2Index + 1] = if (nums1[nums1Index] > nums2[nums2Index]) {
            nums1[nums1Index--]
        } else {
            nums2[nums2Index--]
        }
    }
    while (nums2Index >= 0) {
        nums1[nums2Index] = nums2[nums2Index--]
    }
}
