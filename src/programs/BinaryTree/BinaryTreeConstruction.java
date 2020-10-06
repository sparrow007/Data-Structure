package programs.BinaryTree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeConstruction {

   static class Node {
        int data;
        Node left;
        Node right;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    static class Pair {

        int state;
        Node node;

        Pair(Node node, int state) {
            this.state = state;
            this.node = node;
        }

    }

    static void display(Node root) {

       if(root == null) return;

       if(root.left != null) System.out.print(root.left.data + " - ");

        System.out.print(root.data + " - ");

       if(root.right != null) System.out.print(root.right.data + ".");

        System.out.println();

       display(root.left);
       display(root.right);

    }

    /*
    * Binary tree traversal in left order
    * */

    static void leftOrderTraversal(Node root) {

        if (root == null) return;

        System.out.println(root.data);
        leftOrderTraversal(root.left);

        leftOrderTraversal(root.right);

    }

    /*
     * Binary tree traversal in root node order
     * */

    static void rootOrderTraversal(Node root) {
        if (root == null) return;

        rootOrderTraversal(root.left);
        System.out.println(root.data);
        rootOrderTraversal(root.right);

    }

    /*
     * Binary tree traversal in right node order
     * */

    static void rightOrderTraversal(Node root) {
        if (root == null) return;
        rightOrderTraversal(root.left);
        rightOrderTraversal(root.right);
        System.out.println(root.data);
    }

    //Level order traversal in binary tree
    static void levelOrderTraversal(Node root) {

        Queue<Node> queue = new ArrayDeque<>();
        queue.add(root);

        while (queue.size() > 0) {

            int count = queue.size();
            for (int i = 0; i < count; i++) {
                Node temp = queue.remove();
                System.out.print(temp.data + " ");
                if(temp.left != null) queue.add(temp.left);

                if(temp.right != null) queue.add(temp.right);
            }

            System.out.println();

        }

    }

    static void iterativeTraversal(Node root) {

        Stack<Pair> st = new Stack<>();
        Pair p = new Pair(root, 1);
        st.push(p);

        String pre = "";
        String inr = "";
        String post = "";

        while (st.size() > 0) {

            Pair top = st.peek();

            if(top.state == 1) {
                pre += " " + top.node.data;

                if(top.node.left != null) {
                    Pair leftPair = new Pair(top.node.left, 1);
                    st.push(leftPair);
                }

                top.state++;
            }else if(top.state == 2) {

                inr += " " + top.node.data;

                if(top.node.right != null) {
                    Pair leftPair = new Pair(top.node.right, 1);
                    st.push(leftPair);
                }

                top.state++;

            }else {

                Pair postPair = st.pop();
                post += " " + postPair.node.data;

            }

        }

        System.out.println(pre);
        System.out.println(inr);
        System.out.println(post);

    }

    static ArrayList<Node> pathList = new ArrayList<>();
    public static boolean find(Node node, int data){
        // write your code
        if(node == null) return  false;
        if(node.data == data) {
            pathList.add(node);
            return true;
        }
        boolean isFound;
        isFound = find(node.left, data);
        if (isFound) {
            pathList.add(node);
            return isFound;
        }

        isFound = find(node.right, data);
        if (isFound) {
            pathList.add(node);
            return isFound;
        }

        return isFound;
    }

    static void printKLevelsDown(Node node, int k) {
        if(node == null) return;
        if(k == 0) {
            System.out.println(node.data);
            return;
        }
        printKLevelsDown(node.left, k-1);
        printKLevelsDown(node.right, k-1);
    }

    public static void main(String[] args) {

        Integer[] arr = {50,25, 12, null, null, 37, 30, null, null,null,75,62,null,70
        ,null, null, 87, null, null};

        Stack<Pair> st = new Stack<>();
        Node root = new Node(arr[0], null, null);
        st.push(new Pair(root, 1));
        int index = 0;

        while (st.size() > 0) {

            Pair top = st.peek();

            if(top.state == 1) {
                index++;

                if(arr[index] != null) {
                    top.node.left = new Node(arr[index], null, null);
                    Pair pair = new Pair(top.node.left, 1);
                    st.push(pair);
                }else {
                    top.node.left = null;
                }

                top.state++;

            }else if(top.state == 2) {

                index++;

                if(arr[index] != null) {
                    top.node.right = new Node(arr[index], null, null);
                    Pair pair = new Pair(top.node.right, 1);
                    st.push(pair);
                }else {
                    top.node.right = null;
                }

                top.state++;

            }else {
              st.pop();
            }

        }

        printKLevelsDown(root, 3);

    }

}
