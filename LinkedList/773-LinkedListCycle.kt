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
    val values = intArrayOf(1)
    val cycleIndex = 0
    val head = ListNode(0)
    var cycle: ListNode? = null
    var current: ListNode? = head
    values.forEachIndexed { index, i ->
        val node: ListNode
        if (index == 0) {
            node = head
            node.`val` = i
        } else {
            node = ListNode(i)
            current?.next = node
            current = node
        }
        if (index == cycleIndex) {
            cycle = node
        }
    }
    current?.next = cycle
    println(Solution().hasCycle(head))
}

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if (null == head) return false;
        var fast = head;
        var slow = head;
        
        while(null != fast?.next?.next) {
            fast = fast.next?.next
            slow = slow?.next
            if (fast == slow) {
                return true
            }
        }
        return false
    }
}