class ListNode(var x: Int) {
    var next: ListNode? = null
}

class Solution {
    fun deleteNode(node ListNode) {
        node.x = node.next.x
        node.next = node.next.next
    }
}
