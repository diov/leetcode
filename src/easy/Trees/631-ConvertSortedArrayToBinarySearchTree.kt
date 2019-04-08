fun sortedArrayToBST(nums: IntArray): TreeNode? {
    if (nums.count() == 0) return null
    return generateMidNode(nums, 0, nums.count() - 1)
}

fun generateMidNode(nums: IntArray, minIndex: Int, maxIndex: Int): TreeNode? {
    if (minIndex > maxIndex) return null
    val index = (minIndex + maxIndex) / 2
    val node = TreeNode(nums[index])
    node.left = generateMidNode(nums, minIndex, index - 1)
    node.right = generateMidNode(nums, index + 1, maxIndex)
    return node
}
