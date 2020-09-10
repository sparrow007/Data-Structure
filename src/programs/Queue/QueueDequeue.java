package programs.Queue;

import java.util.Scanner;

public class QueueDequeue {

    private static Node head;
    private static Node tail;

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

    //Insert Last
    static void enqueue(int val) {

        Node tempNode = new Node(val);

        if (head == null)
            head = tempNode;
        else {

            Node traverseNode = head;

            while(traverseNode.next != null) {
                traverseNode = traverseNode.next;
            }

            traverseNode.next = tempNode;
            tempNode.prev = traverseNode;
            tail = tempNode;

        }


    }

    static int deqeueu() {

        if (head == null) return  -1;

        Node temp = head.next;
        int data = head.data;
        head.next = null;
        head = temp;
        return data;

    }

    static void display() {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }

    }

    public static void main(String[] args) {


        enqueue(50);
        enqueue(40);
        enqueue(80);
        enqueue(60);
        enqueue(10);

        display();
        deqeueu();
        System.out.println();
        display();

    }

}
