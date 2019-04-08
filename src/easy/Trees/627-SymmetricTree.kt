fun isSymmetric(root: TreeNode?): Boolean {
    if (null == root) return true
    return isSymmetric(root.left, root.right)
}

private fun isSymmetric(left: TreeNode?, right: TreeNode?): Boolean {
    if (left == null && right == null) {
        return true
    }
    if (left?.`val` != right?.`val`) {
        return false
    }
    return (isSymmetric(left?.left, right?.right) && isSymmetric(left?.right, right?.left))
}
