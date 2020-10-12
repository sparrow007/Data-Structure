package programs.BinaryTree;

import java.util.ArrayList;
import java.util.Stack;


class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class InorderIterative {

        Node root;

         void traversal() {

             if(root == null) return;

          Stack<Node> st = new Stack<>();

          Node current = root;

          while(current != null || st.size() > 0) {

              while (current != null) {

                  st.push(current);
                  current = current.left;
              }

              current = st.pop();
              System.out.println(current.data + " -- ");

              current = current.right;

          }

        }


    public static void main(String[] args) {
        InorderIterative tree = new InorderIterative();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.traversal();

        ArrayList<Integer> at = new ArrayList<>();
        at.addAll()
    }
}
