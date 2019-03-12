fun main(args: Array<String>) {
    val l1values = intArrayOf(1, 2, 3, 4)
    val l1 = ListNode(0)
    var current1: ListNode? = l1
    l1values.forEachIndexed { index, i ->
        if (index == 0) {
            l1.`val` = i
        } else {
            current1?.next = ListNode(i)
            current1 = current1?.next
        }
    }
    val l2values = intArrayOf(5, 6, 7, 8)
    val l2 = ListNode(0)
    var current2: ListNode? = l2
    l2values.forEachIndexed { index, i ->
        if (index == 0) {
            l2.`val` = i
        } else {
            current2?.next = ListNode(i)
            current2 = current2?.next
        }
    }
    mergeTwoLists(l1, l2)?.printList()
}

fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (null == l1) return l2
    if (null == l2) return l1

    var head: ListNode
    if (l1.`val` > l2.`val`) {
        head = l2
        head.next = mergeTwoLists(l1, l2.next)
    } else {
        head = l1
        head.next = mergeTwoLists(l1.next, l2)
    }
    return head
}
