package programs.dp;

import java.io.*;
import java.util.*;

public class Fibnacci {


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int fib = fib(n, new int[n+1]);

        System.out.println(fib);

    }


    /**
     * This recursion calls make lot of same request in the recursion which has already
     * created or evaluated.
     */
    static int fib(int n) {

        if (n == 0 || n ==1) {
            return n;

        }

        return fib(n-1) + fib(n-2);

    }

    /**
     * We can create an array which stored the calculated values inside it.
     * so we can re-use it for other calls which are going calculate (Memorised)
     *
     */

    static int fib(int n, int qb[]) {
        if (n == 0 || n == 1) {
            return n;
        }

        if (qb[n] != 0) {
            return qb[n];
        }

        int data = fib(n-1, qb) + fib(n-2, qb);
        qb[n] = data;
        return data;
    }


}
