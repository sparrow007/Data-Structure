package programs.GenericTree;

import java.util.*;

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

        //System.out.println(max(root));
        levelOrderLinewiseZZ(root);


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

    //Find the max element in the generic tree
    public static int max(Node node) {
        int max = 0;

        max = node.data;


        for (Node child : node.childrens) {
            int data = max(child);
            max = Math.max(max, data);
        }

        return max;

    }

    public static int height(Node node) {
        // write your code here
        int ht = 0;

        for (Node child : node.childrens) {
            int ch = height(child);
            ht = Math.max(ch , ht);
        }

        ht += 1;

        return ht;
    }

    //Traversal
    public static void traverse(Node node) {
        System.out.println("Node Pre " + node.data);

        for (Node child : node.childrens) {
            System.out.println("Edge Pre " + node.data + "--" + child.data);
            traverse(child);
            System.out.println("Edge Post " + node.data + "--" + child.data);
        }

        System.out.println("Node Post " + node.data);

    }

    //Level order traversal
    public static void levelOrder(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        while (queue.size() > 0) {

            Node temp = queue.remove();
            System.out.print(" "+temp.data + "");

            queue.addAll(temp.childrens);

        }

        System.out.print(".");

    }

    //Level order line wise traversal
    public static void levelLineOrder(Node node) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(node);

        Queue<Node> childQueue = new ArrayDeque<>();

        while (queue.size() > 0 || childQueue.size() > 0) {

            if (queue.size() == 0) {
                queue = childQueue;
                childQueue = new ArrayDeque<>();
                System.out.println();
            }

            Node temp = queue.remove();
            System.out.print(temp.data + " ");
           childQueue.addAll(temp.childrens);

        }

    }

    public static void levelOrderLinewiseZZ(Node node){
        // write your code here

        Stack<Node> st = new Stack<>();
        Stack<Node> childStack = new Stack<>();
        st.push(node);

        boolean isZigZag = true;

        while (!st.isEmpty() || !childStack.isEmpty()) {

            if (st.isEmpty()) {
                st = childStack;
                childStack = new Stack<>();
                System.out.println();
                isZigZag = !isZigZag;
            }

            Node temp = st.pop();
            System.out.print(temp.data + " ");
            if (isZigZag) {
                childStack.addAll(temp.childrens);
            }else {
                for (int i = temp.childrens.size() - 1; i >= 0; i--)
                    childStack.push(temp.childrens.get(i));
            }

        }


    }

}
