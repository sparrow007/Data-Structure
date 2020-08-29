package programs.LinkList;

import java.util.HashSet;

public class RemoveDuplicates {

    static class Node {
        int data;
        Node next;

    }

    Node removeDuplicates(Node root)
    {
        Node temp = root;

        while (temp != null && temp.next != null) {
            if(temp.data == temp.next.data) {
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }


        }

        return root;

    }

    //Un sorted array
    public Node removeDuplicates(Node head, int data)
    {
        if(head.next == null) return head;

        Node temp = head.next;
        Node slowTemp = head;
        HashSet<Integer> hset = new HashSet<>();
        hset.add(slowTemp.data);

        while (temp != null) {

            if(hset.contains(temp.data)) {
                slowTemp.next = temp.next;
                temp = temp.next;
                continue;
            }else
                hset.add(temp.data);

            slowTemp = slowTemp.next;
            temp = temp.next;
        }

        return head;
    }
}
