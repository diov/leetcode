fun isValidBST(root: TreeNode?): Boolean {
    if (root == null) return true
    return isInRange(root, Long.MIN_VALUE, Long.MAX_VALUE)
}

private fun isInRange(node: TreeNode?, min: Long, max: Long): Boolean {
    if (null == node) return true
    if (node.`val` !in (min + 1)..(max - 1)) return false
    return isInRange(node.left, min, node.`val`.toLong())
            && isInRange(node.right, node.`val`.toLong(), max)
}
