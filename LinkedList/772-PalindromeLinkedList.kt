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
    println(Solution().isPalindrome(head))
}

class Solution {
    fun isPalindrome(head: ListNode?): Boolean {
        if (null == head) return true

        var fast = head
        var slow = head
        var pre: ListNode? = null
        while(null != fast && null != fast?.next) {
            fast = fast.next?.next
            var temp = slow?.next
            slow?.next = pre
            pre = slow
            slow = temp
        }

        if (null != fast) {
            slow = slow?.next
        }

        while(null != slow) {
            println("pre: ${pre?.`val`}; slow: ${slow?.`val`}")
            if (pre?.`val` != slow.`val`) {
                return false
            }
            pre = pre.next
            slow = slow.next
        }
        return true
    }
}
