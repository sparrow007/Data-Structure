package programs.BinaryTree;

public class LargestSubTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;

        }
    }


    static class BSTPair {
        int ht;
        boolean isBSTPair;
        int min;
        int max;
        Node largestBST;

    }

    static BSTPair largestBST(Node node) {

        if(node == null) {
            BSTPair bp = new BSTPair();
            bp.ht = -1;
            bp.min = Integer.MAX_VALUE;
            bp.max = Integer.MIN_VALUE;
            bp.largestBST = null;
        }

        BSTPair lp = largestBST(node.left);
        BSTPair rp = largestBST(node.right);

        BSTPair mp = new BSTPair();

        mp.isBSTPair = lp.isBSTPair && rp.isBSTPair && (node.data >= lp.max &&
                node.data <= rp.min);

        mp.ht = Math.max(lp.ht , rp.ht) + 1;

        mp.min = Math.min(node.data, Math.min(lp.min, rp.min));
        mp.max = Math.max(node.data, Math.max(lp.max, rp.max));

        if(mp.isBSTPair) {
            mp.largestBST = node;
        }

        return mp;
    }

}
