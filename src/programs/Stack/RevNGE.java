package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevNGE {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < a.length; i++)
            a[i] = scanner.nextInt();

        Stack<Integer> greaterElementStack = new Stack<>();
        int[] nge = new int[n];
        greaterElementStack.push(a[a.length-1]);
        nge[n-1] = -1;

        for (int i = nge.length-2; i >= 0; i--) {

            while (greaterElementStack.size() > 0 && a[i] > greaterElementStack.peek())
                      greaterElementStack.pop();

            if(greaterElementStack.isEmpty()) {
                nge[i] = -1;
            }else {
                nge[i] = greaterElementStack.peek();
            }

            greaterElementStack.push(a[i]);
        }

        for (int i = 0; i < nge.length; i++) {
            System.out.println(nge[i]);
        }


        for (; ; ) {

        }
    }

}
