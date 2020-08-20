package programs.LinkList;

public class LinkList {

    public static class Node{
        int data;
        Node next;
        Node prev;
    }
    public static class LinkedList{
        Node head;
        Node tail;
        int size;
        void  addFirst(int val){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(size==0){
                head=tail=node;
            }else {
                node.next=head;
                head=node;
            }
            size++;
        }

        void addLast(int val){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(size==0){
                head=tail=node;
            }else {
                tail.next=node;
                tail=node;
            }
            size++;
        }

        void  addAt(int val,int idx){
            Node node=new Node();
            node.data=val;
            node.next=null;
            if(idx<0||idx>=size){
                System.out.println("wrong input");
            }
            else if(idx==0){
                addFirst(val);
            }
            else if(idx==size-1){
                addLast(val);
            }else {
                Node temp=head;
                for (int i=0;i<idx-1;i++){
                    temp=temp.next;
                }
                node.next=temp.next;
                temp.next=node;
                size++;
            }
        }

        void display(){
            Node temp=head;
            while (temp != null){

                if(temp.prev != null)
                    System.out.println(temp.prev.data);
                else
                    System.out.println("Null");

                temp=temp.next;
            }
//            System.out.println(tail.data);
//            System.out.println("Tail next node is = " + tail.next.data);
        }

        void makeDoubly() {

            Node first = head;
            first.prev = null;
            Node second = head.next;

            while(second != null) {
                second.prev = first;
                second = second.next;
                first = first.next;
            }
        }

        void deleteFirst() {

            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }
            head = head.next;
            size--;
        }

        void deleteLast() {
            if(size == 1) {
                head = null;
                tail = null;
                size--;
                return;
            }
            Node temp = head;

            while(temp.next != tail)
                temp = temp.next;

            temp.next = null;
            tail = temp;
            size--;
        }

        void deleteIndex(int index) {


        }

        void searchElement(int data) {
            Node temp = head;
            int flag = 0;
            while(temp != null) {
                if(temp.data == data) {
                    flag = 1;
                    break;
                }
                temp = temp.next;
            }

            if(flag == 1) {
               System.out.println("Element is found in the list");
            }else {
                System.out.println("Element is not found in the list");
            }
        }

        Node findNode(int index) {
            if(index < 0 || index >= size) {
                return null;
            }
            Node temp = head;

            for(int i = 0; i < index; i++)
                temp = temp.next;

            return temp;
        }

        void countNodeData(int data) {

            Node temp = head;
            int counter = 0;
            while(temp != null) {
                if(temp.data == data)
                    counter++;

                temp = temp.next;
            }

           System.out.println("Nodes data are repeated = " + counter);
        }

        void findMinMax() {
            Node temp = head;
            int min = temp.data;
            int max = temp.data;
            while (temp != null) {
                min = Math.min(min, temp.data);
                max = Math.max(max, temp.data);
                temp = temp.next;
            }

            System.out.println("Min value = " + min + "\n  Max value = " + max);
        }

        void createCircularList() {
            tail.next = head;
        }

    }

    public static void main(String[] args){
        LinkedList list=new LinkedList();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(20);
        list.addLast(30);
        list.addLast(30);
        list.addLast(30);
        list.addLast(40);
        list.addLast(40);
        list.addLast(40);
        //list.addAt(100,1);
        //list.display();
//        System.out.println(list.size);
       // System.out.println("Next List");
        //list.display();

        //list.searchElement(20);

//        Node node = list.findNode(50);
//        if(node != null)
//        System.out.println(node.data + " || --> " + node.next);
//        else
//         System.out.println("Node is not available");

        //
        list.makeDoubly();
        list.display();
    }
}
