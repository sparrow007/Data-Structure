package programs.LinkList;

public class MergeTwoList {

    static class SinglyLinkedListNode {

       public SinglyLinkedListNode(int data) {
            this.data = data;
        }

        int data;
        SinglyLinkedListNode next;
    }

    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {

        if(headA == null) return headB;
        else if(headB == null) return headA;

        SinglyLinkedListNode newHead;

        if(headA.data < headB.data) {
            newHead = new SinglyLinkedListNode(headA.data);
            headA = headA.next;
        }else {
            newHead = new SinglyLinkedListNode(headB.data);
            headB = headB.next;
        }

        SinglyLinkedListNode tempA = headA;
        SinglyLinkedListNode tempB = headB;
        SinglyLinkedListNode temp = newHead;

        while(tempA != null && tempB != null) {

            if(tempA.data < tempB.data) {
                temp.next = tempA;
                tempA = tempA.next;
            }else {
                temp.next = tempB;
                tempB = tempB.next;
            }

            temp = temp.next;

        }

        if(tempA != null) temp.next = tempA;
        else if(tempB != null) temp.next = tempB;

        return newHead;
    }


    public static void main(String[] args) {

    }
}
