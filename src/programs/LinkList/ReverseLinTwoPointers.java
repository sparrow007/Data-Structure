package programs.LinkList;

import java.util.HashSet;

public class ReverseLinTwoPointers {

    class Node {
        int data;
        Node next;
    }

    class ReverseLL
    {
        Node start;

        void reverse(Node fast, Node slow) {
            if(fast.next == null)
            {
                fast.next = slow;
                start = fast;
                return;
            }

            HashSet<Integer> hset = new HashSet<>();

            reverse(fast.next, slow.next);
            fast.next = slow;

        }


        // This function should reverse linked list and return
        // head of the modified linked list.
        Node reverseList(Node head)
        {
            if(head.next == null)
                return head;

            Node slow = head;
            Node fast = head.next;

            reverse(fast, slow);
            head.next = null;
            return start;

        }
    }


    //With most optimize recursive method
    Node reverseList(Node head)
    {
        if(head.next == null) return head;
        Node newHead = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }


    // This function should reverse linked list and return
    // head of the modified linked list.
    //Iterative method for reverse the link list;

    //three pointers recursion


    Node reverseLinkList(Node head)
    {
        Node prev = null;
        Node cur = head;
        Node next = null;

        while(cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        return prev;
    }
}
