package programs.dp;

import java.util.Scanner;

public class ZeroOneKnapSack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[]value = new int[n];
        int[]weight = new int[n];

        for (int i = 0; i < n; i++) value[i] = scanner.nextInt();

        for (int i = 0; i < n; i++) weight[i] = scanner.nextInt();

        int cap =scanner.nextInt();

        int[][]dp = new int[n+1][cap+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (weight[i-1] <= j) {

                    int element = weight[i-1];
                    int val = value[i-1] + dp[i-1][j-element];
                    if (val > dp[i-1][j]) {
                        dp[i][j] = val;
                    }else
                        dp[i][j] = dp[i-1][j];

                }else {
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

        System.out.println(dp[n][cap]);
    }
}
