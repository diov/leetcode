class ListNode(var `val`: Int) {
    var next: ListNode? = null

    fun printList() {
        println(`val`)
        var nextNode = next
        while (null != nextNode) {
            println(nextNode.`val`)
            nextNode = nextNode.next
        }
    }
}