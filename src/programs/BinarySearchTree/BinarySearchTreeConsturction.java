package programs.BinarySearchTree;

public class BinarySearchTreeConsturction {

   static class Node {
        int data;
        Node right;
        Node left;

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static Node construction(int[] a, int lo, int hi) {

        if(lo > hi) return null;

        int mid = (lo + hi) / 2;
        int data = a[mid];
        Node lc = construction(a, lo, mid - 1);
        Node rc = construction(a, mid + 1, hi);


        return new Node(data, lc,rc);

    }

    static void display(Node root) {
       if(root == null) return;

        System.out.println(root.data + " ");
        display(root.left);
        display(root.right);

    }

    public static void main(String[] args) {
        int a[] = {12, 25,37,50,62,75,87};
        Node root = construction(a, 0, a.length-1);
        display(root);
    }
}
