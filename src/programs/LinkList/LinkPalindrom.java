package programs.LinkList;

public class LinkPalindrom {

    class Node {
        int data;
        Node next;
    }

    class Palindrome
    {
        Node start;
        //Helper function to check palindrom
        boolean findPalindrom(Node end, int floor, int size) {
            if(end == null)
                return true;

            boolean isPalin = findPalindrom(end.next, floor + 1, size);

            if(floor >= size/2 && isPalin) {

                if(start.data == end.data) {
                    isPalin = true;
                }else {
                    isPalin =  false;
                }
                start = start.next;
            }

            return isPalin;

        }

        // Function to check if linked list is palindrome
        boolean isPalindrome(Node head)
        {
            int size = 0;
            Node temp = head;
            while(temp != null) {
                size++;
                temp = temp.next;
            }
            start = head;
            return findPalindrom(head, 0, size);
        }
    }

}
