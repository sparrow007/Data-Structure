package programs.dp;

import java.util.Scanner;

public class UnBoundedKnap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) value[i] = scanner.nextInt();

        for (int i = 0; i < n; i++) weight[i] = scanner.nextInt();

        int cap =scanner.nextInt();

        int[][]dp = new int[n+1][cap+1];

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (weight[i-1] <= j) {

                    int max = value[i-1]+dp[i][j-weight[i-1]];

                    for (int k = i - 1; k >= 0; k--) {
                        if (j % weight[k] == 0)
                        max = Math.max(max, value[k] * (j / weight[k]));
                    }

                    if (max < dp[i-1][j]) max = dp[i-1][j];

                    dp[i][j] = max;

                }else {
                    dp[i][j] = dp[i-1][j];
                }

            }
        }

//
//        for (int i = 0; i < dp.length; i++) {
//            for (int j = 0; j < dp[0].length; j++) {
//                System.out.print(dp[i][j] + " ");
//            }
//
//            System.out.println();
//        }

        System.out.println(dp[n][cap]);
    }
}
