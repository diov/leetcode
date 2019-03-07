/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
    
    fun printList() {
        println(`val`)
        var nextNode = next
        while(null != nextNode) {
            println(nextNode.`val`)
            nextNode = nextNode.next
        }
    }
}

fun main(args: Array<String>) {
    val values = intArrayOf(1,2)
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
    Solution().reverseList(head)?.printList()
}

class Solution {
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
}
