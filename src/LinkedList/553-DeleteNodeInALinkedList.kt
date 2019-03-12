fun deleteNode(node: ListNode) {
    val next = node.next ?: return
    node.`val` = next.`val`
    node.next = next.next
}

