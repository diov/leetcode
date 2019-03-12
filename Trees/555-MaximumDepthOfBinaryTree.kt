/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
import kotlin.math.max

class Solution {
    fun maxDepth(root: TreeNode?): Int {
        if (null == root) return 0
        return 1 + max(maxDepth(root.left), maxDepth(root.right))
    }
}