fun main(args: Array<String>) {
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
    removeNthFromEnd(head, 2)?.printList()
}

fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
    if (null == head) {
        return null
    }
    var fast: ListNode? = head
    var slow: ListNode? = head

    for (i in 0 until n) {
        fast = fast?.next
    }

    if (null == fast) {
        return head?.next
    }

    while (null != fast?.next) {
        fast = fast?.next
        slow = slow?.next
    }
    slow?.next = slow?.next?.next
    return head
}
