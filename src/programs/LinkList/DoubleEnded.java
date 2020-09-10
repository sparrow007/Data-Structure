package programs.LinkList;

public class DoubleEnded {

    private  Node head;
    private  Node tail;

    static class  Node {

        int data;
        Node next;
        Node prev;

        Node(int data) {
            this.data = data;
            next = null;
            prev = null;
        }


    }

    //Insert element to the Last of the link list
    public  void insertLast(int val) {

        Node tempNode = new Node(val);

        if (head == null) {
            head = tempNode;
            tail = head;
        }
        else {
            tempNode.prev = tail;
            tail.next = tempNode;
            tail = tempNode;

        }


    }

    //remove the element from the list from the last
    public  int removeLast() {

        if (tail == null) return -1;

        Node temp = tail.prev;
        int data = tail.data;
        tail.prev = null;
        tail = temp;
        return data;
    }

    //Insert the element at the first position of list
    public  void insertFirst(int val) {

        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        }else {

            temp.next = head;
            head.prev =temp;
            head = temp;

        }

    }

    //Remove the element from the link list from the first
    public  int removeFirst() {

        if (head == null) return  -1;

       Node temp = head.next;
        int data = head.data;
        head.next = null;
        head = temp;
        return data;

    }

    public void display() {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

        System.out.println();

    }

    public boolean isEmpty() {
        return head == null;
    }

    public int size() {
        if (head == null) return 0;

        Node temp = head;
        int size = 0;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

}
