fun main() {
    val values = intArrayOf(1, 2)
    val head = ListNode(0)
    var current: ListNode? = head
    values.forEachIndexed { index, i ->
        if (index == 0) {
            head.`val` = i
        } else {
            current?.next = ListNode(i)
            current = current?.next
        }
    }
    reverseList(head)?.printList()
}

fun reverseList(head: ListNode?): ListNode? {
    if (head == null) {
        return null
    }

    val next = head.next
    head.next = null
    if (null != next) {
        val reversedNode = reverseList(next)
        next.next = head
        return reversedNode
    }
    return head
}
