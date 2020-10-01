package programs.GenericTree;

import java.util.ArrayList;
import java.util.Stack;

public class GenericTreeStatic {

    static int min;
    static int height;
    static int size;
    //Node of the tree and it's data with it's next childrens
    static class Node {

        int data;
        ArrayList<Node> childrens;

        Node(int data) {
            this.data = data;
            childrens = new ArrayList<>();
        }
    }

    static int max = Integer.MIN_VALUE;
    static int max_node = 0;

    static int sum(Node node) {

        int childSum = 0;

        if(node.childrens.size() == 0) {
            childSum =  node.data;
        }


        for (Node child : node.childrens) {
            childSum += sum(child);
        }

        if(childSum > max) {
            max_node = node.data;
            max = childSum;
        }
        System.out.println("childSum " + childSum + " node " + node.data);
        return childSum;
    }

    public static void main(String[] args) {

        int arr[] = { 10, 20, -50, -1, 60, -1, -1, 30, -70, -1, 80, 110, -1,120, -1,-1,90, -1,-1,40
                ,-100,-1, -1,-1};

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

        min = Integer.MAX_VALUE;
        max = Integer.MIN_VALUE;
        height = 0;

        sum(root);

        System.out.println(max);
        System.out.println(max_node);

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
