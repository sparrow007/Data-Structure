package programs.LinkList;

import java.util.HashSet;

public class MergePointOfList {
    static class SinglyLinkedListNode {

        public SinglyLinkedListNode(int data) {
            this.data = data;
        }

        int data;
        SinglyLinkedListNode next;
    }

    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

        int firstSize = 0;
        int secondSize = 0;

        SinglyLinkedListNode tempA = head1;
        SinglyLinkedListNode tempB = head2;


        HashSet<Integer> hashSet;

        while(tempA != null) {
            firstSize++;
            tempA = tempA.next;
        }

        while(tempB != null) {
            secondSize++;
            tempB = tempB.next;
        }

        tempA = head1;
        tempB = head2;

        if(firstSize > secondSize) {
            for (int i = 0; i < firstSize - secondSize; i++) {
                tempA = tempA.next;
            }
        }else {
            for (int i = 0; i < secondSize - firstSize; i++)
                tempB = tempB.next;
        }

        while(tempA != null && tempB != null) {

            if(tempA == tempB) {
                return tempA.data;
            }

            tempA = tempA.next;
            tempB = tempB.next;
        }

        return -1;

    }
}
