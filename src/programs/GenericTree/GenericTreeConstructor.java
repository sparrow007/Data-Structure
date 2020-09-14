package programs.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeConstructor {

    //Node of the tree and it's data with it's next childrens
   static class Node {

        int data;
        ArrayList<Node> childrens;

        Node(int data) {
            this.data = data;
            childrens = new ArrayList<>();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1,120, -1,-1,90, -1,-1,40
        ,100,-1, -1,-1};

        Stack<Node> st = new Stack<>();
        Node root = new Node(arr[0]);
        st.push(root);

        for (int i = 1; i < arr.length; i++ ) {

            if (arr[i] != -1) {
                Node node = new Node(arr[i]);
                st.peek().childrens.add(node);
                st.push(node);
            }else {
                st.pop();
            }

        }

        System.out.println(size(root));


    }

    /*
    * Display is used to show the generic tree elements
    * @param Node root node
    * */
    static void display(Node node) {

        System.out.print(node.data + " -> ");

        for (Node child : node.childrens) {
            System.out.print(child.data + ", ");
        }

        System.out.println();

        for (Node child : node.childrens) {
            display(child);
        }

    }

    public static int size(Node node){
        // write your code here

       int size = 0;

       for (Node child : node.childrens) {
           int cs = size(child);
           size += cs;
       }

       size += 1;

        return size;
    }
}
