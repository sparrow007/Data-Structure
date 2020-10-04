package programs.GenericTree;

import java.util.ArrayList;
import java.util.Iterator;
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

//        sum(root);
//
//        System.out.println(max);
//        System.out.println(max_node);

        //System.out.println(max(root));

        GenericTreeRunner gti = new GenericTreeRunner(root);

        for(Integer i : gti) {
            System.out.print(i + " ");
        }

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

    static class GenericTreeRunner implements Iterable<Integer> {
        Node root;

        GenericTreeRunner(Node node) {
            this.root = node;
        }

        @Override
        public Iterator<Integer> iterator() {
            GenericTreeIterator genericTreeIterator = new GenericTreeIterator(root);
            return genericTreeIterator;
        }

        static  class GenericTreeIterator implements  Iterator<Integer> {

            Integer value;
            Stack<Pair> st;

            GenericTreeIterator(Node node) {
                st = new Stack<>();
                st.push(new Pair(node, -1));
                next();
            }

            @Override
            public boolean hasNext() {
                return value != null;
            }

            @Override
            public Integer next() {
                Integer cv = value;

                value = null;
                while (st.size() > 0 ) {

                    Pair top = st.peek();

                    if(top.state == -1) {
                        value = top.node.data;
                        top.state++;
                        break;
                    }else if(top.state == top.node.childrens.size() ) {
                        st.pop();
                    }else {
                        Pair ch =  new Pair(top.node.childrens.get(top.state), -1);
                        st.push(ch);
                        top.state++;
                    }

                }


                return cv;
            }
        }

        private static class Pair {
            Node node;
            int state;

            Pair(Node node, int state) {
                this.node = node;
                this.state = state;
            }
        }
    }

}
