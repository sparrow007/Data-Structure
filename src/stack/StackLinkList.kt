package stack

import java.lang.IllegalStateException
import java.util.*

class StackLinkList {
    var size = 0
    var headNode: Node? = null

    data class Node(
        var element: Int,
        var nextNode: Node?
    )

    fun peek(): Node {
        return Node(0, null)
    }


    fun push(element: Int) {
        val node = Node(element, null)
        node.nextNode = headNode
        headNode = node
        size++
    }

    fun pop(): Int {
        //we need to send the top position
        if (headNode == null) {
            //underflow
            throw IllegalStateException("Underflow in stack")
        }
        val element = headNode?.element
        headNode = headNode?.nextNode
        size--
        return element ?: -1
    }

    fun elementAtBottom(element: Int) {
        if (headNode == null) {
            headNode = Node(element, null)
            return
        }
        insertAtBottom(element, headNode!!)
    }

    private fun insertAtBottom(element: Int, node: Node) {
        if (node.nextNode == null) {
            node.nextNode = Node(element, null)
            size++
        } else {
            insertAtBottom(element, node.nextNode!!)
        }
    }

    fun printStack() {
        var temp = headNode
        while (temp != null) {
            print(temp.element)
            println()
            temp = temp.nextNode
        }
    }

}
 fun main() {
  val stack = StackLinkList()
     stack.push(10)
     stack.apply {
         push(20)
         push(30)
         push(40)
         push(50)
         elementAtBottom(60)
         printStack()
     }
 }