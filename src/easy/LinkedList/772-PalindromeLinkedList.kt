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
    println(isPalindrome(head))
}

fun isPalindrome(head: ListNode?): Boolean {
    if (null == head) return true

    var fast = head
    var slow = head
    var pre: ListNode? = null
    while (fast?.next != null) {
        fast = fast.next?.next
        val temp = slow?.next
        slow?.next = pre
        pre = slow
        slow = temp
    }

    if (null != fast) {
        slow = slow?.next
    }

    while (null != slow) {
        if (pre?.`val` != slow.`val`) {
            return false
        }
        pre = pre.next
        slow = slow.next
    }
    return true
}
