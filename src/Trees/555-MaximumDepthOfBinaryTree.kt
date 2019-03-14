import kotlin.math.max

fun maxDepth(root: TreeNode?): Int {
    if (null == root) return 0
    return 1 + max(maxDepth(root.left), maxDepth(root.right))
}
