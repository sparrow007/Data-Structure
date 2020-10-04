package programs.BinaryTree;

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

        display(root);

    }

}
