package programs.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeStatic {

    static int min;
    static  int max;
    static int height;
    static int size;
    //Node of the tree and it's data with it's next childrens
    static class Node {

        int data;
        ArrayList<GenericTreeConstructor.Node> childrens;

        Node(int data) {
            this.data = data;
            childrens = new ArrayList<>();
        }
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, 50, -1, 60, -1, -1, 30, 70, -1, 80, 110, -1,120, -1,-1,90, -1,-1,40
                ,100,-1, -1,-1};

        Stack<GenericTreeConstructor.Node> st = new Stack<>();
        GenericTreeConstructor.Node root = new GenericTreeConstructor.Node(arr[0]);
        st.push(root);

        for (int i = 1; i < arr.length; i++ ) {

            if (arr[i] != -1) {
                GenericTreeConstructor.Node node = new GenericTreeConstructor.Node(arr[i]);
                st.peek().childrens.add(node);
                st.push(node);
            }else {
                st.pop();
            }

        }

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        height = 0;



        //System.out.println(max(root));

    }

    /*
     * Display is used to show the generic tree elements
     * @param Node root node
     * */
    static void display(GenericTreeConstructor.Node node) {

        System.out.print(node.data + " -> ");

        for (GenericTreeConstructor.Node child : node.childrens) {
            System.out.print(child.data + ", ");
        }

        System.out.println();

        for (GenericTreeConstructor.Node child : node.childrens) {
            display(child);
        }

    }

    static void calculateMain(Node node, int depth) {
        size++;


    }

}
