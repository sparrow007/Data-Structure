package programs.LinkList;

import java.util.HashSet;

public class CountLoop {

    static class Node {
        int data;
        Node next;

    }


    static int countNodesinLoop(Node head)
    {
        HashSet<Node> hset = new HashSet<Node>();
        Node found = null;
        Node temp = head;
        boolean isFound = false;
        while (temp != null) {
            if(hset.contains(temp)) {
                found = temp;
                isFound = true;
                break;
            }

            hset.add(temp);
            temp = temp.next;
        }

        if(isFound) {
            Node tmp = found.next;
            int count= 0;
            while (tmp != null) {
                count++;
                if(tmp == found) break;

                tmp = tmp.next;

            }
            return count;
        }else {
            return 0;
        }
    }
}
