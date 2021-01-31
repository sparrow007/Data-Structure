package programs.dp;

import java.io.*;
import java.util.*;

public class ClimbStiarWithMinMove {

    public static void main(String[] args) throws Exception {
        // write your code here

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int[] dp = new int[n+1];

        dp[n] = 0;

        for (int i = n-1; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {

                if(dp[i+j] != 0 || i+j == n)
                    min = Math.min(dp[i+j] , min);

            }

            if (min != Integer.MAX_VALUE)
                dp[i] = min+1;
        }

        // for(int i = 0; i < dp.length; i++) {
        //     System.out.print(dp[i] + " ");
        // }
        // System.out.println();
        System.out.println(dp[0]);

    }

}
