package programs.BinaryTree;

public class PostFromInPre {

    static int preIndex = 0;
    void printPost(int[] in, int[] pre, int inStrt, int inEnd)
    {
       if(inStrt > inEnd) return;

       int index = search(in, inStrt, inEnd, pre[preIndex++]);

       //left subtree
       printPost(in, pre, inStrt, index-1);

       //right subtree
       printPost(in, pre, index+1, inEnd);

        System.out.print(in[index] + " ");

    }

    int search(int[] in, int startIn, int endIn, int data)
    {

       // System.out.println("start = " + startIn + " end = " + endIn);
        int i = 0;
        for (i = startIn; i < endIn; i++)
            if (in[i] == data)
                return i;
        return i;
    }

    // Driver code
    public static void main(String ars[])
    {
        int in[] = { 4, 2, 5, 1, 3, 6 };
        int pre[] = { 1, 2, 4, 5, 3, 6 };
        int len = in.length;
        PostFromInPre tree = new PostFromInPre();
        tree.printPost(in, pre, 0, len - 1);
    }
}


