fun maxDepth(root: TreeNode?): Int {
    if (null == root) return 0
    return 1 + maxOf(maxDepth(root.left), maxDepth(root.right))
}
