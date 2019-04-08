val result = mutableListOf<MutableList<Int>>()

fun levelOrder(root: TreeNode?): List<List<Int>> {
    fillList(root, 0)
    return result
}

fun fillList(node: TreeNode?, depth: Int) {
    if (null == node) return
    if (result.size == depth) {
        result.add(mutableListOf())
    }

    result[depth].add(node.`val`)
    fillList(node.left, depth + 1)
    fillList(node.right, depth + 1)
}
