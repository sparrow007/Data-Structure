package programs.LinkList;

import java.util.Stack;

public class LinkListAllOperation {

    Node head; // head of list

    /* Linked list Node*/
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

/*
* Space complextiy  1
*
* Time complexity  n
*
* */


    static boolean isPalindrom(Node head ) {
        //Stack
        Stack<Node> st = new Stack<>();

        Node temp = head;

        //Push the data into the stack
        while(temp != null) {
            st.push(temp);
            temp = temp.next;
        }

       //Check the value of head and top of the stack
       //If both the values are not eqal then return false;
       //if same then return true

        temp = head;

        while(temp != null && st.size() > 0) {

            Node stackTop = st.pop();

            if(temp.data != stackTop.data) {
                return false;
            }

           temp = temp.next;
        }

        return true;
    }

   void deleteNodeByKey(int position) {

        //Retern next node as a head if the position is first element
        if(position == 0) {
            head = head.next;
            return;
        }

        Node temp = head, prev = null;

        //Count the position && move along with the list
        while (temp != null && position != 0) {
            prev = temp;
            temp = temp.next;
            position--;
        }

        if(temp == null) return;

        prev.next = temp.next;

   }

    /* Given a key, deletes the first occurrence of key in linked list */
    void deleteNode(int key)
    {
        // Store head node
        Node temp = head, prev = null;

        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }

        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }

        // If key was not present in linked list
        if (temp == null) return;

        // Unlink the node from linked list
        prev.next = temp.next;
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data)
    {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    /* This function prints contents of linked list starting from
        the given node */
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
    }

    /* Drier program to test above functions. Ideally this function
    should be in a separate user class. It is kept here to keep
    code compact */
    public static void main(String[] args)
    {
        LinkListAllOperation llist = new LinkListAllOperation();

        llist.push(2);
        llist.push(3);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("Created Linked list is:");
        llist.printList();

        System.out.println("\nIs list a palindrom " + isPalindrom(llist.head));

//        System.out.println("\nLinked List after Deletion of 1:");
//        llist.printList();
    }
}
