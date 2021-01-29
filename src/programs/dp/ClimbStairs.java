package programs.dp;

import java.io.*;
import java.util.*;

public class ClimbStairs {


    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        System.out.println(climbStairWithMemo(n, new int[n+1]));

    }

    static int climbStairWithMemo(int n, int[] dp) {

        if (n == 0) return 1;
        else if (n < 0) return 0;

        if (dp[n] != 0) return dp[n];

        //  System.out.println("Hello world " + n);

        int total =  climbStairWithMemo(n - 1, dp) + climbStairWithMemo(n - 2, dp) +                                climbStairWithMemo(n - 3, dp);
        dp[n] = total;

        return total;

    }

    static int climbStiar(int n) {

        if (n == 0) {
            return 1;

        } else if (n < 0) return 0;

        System.out.println("Hello world " + n);
        return climbStiar(n - 1) + climbStiar(n - 2) + climbStiar(n - 3);

    }

}
