package programs.dp;

import java.util.Scanner;

public class CoinChangeComb {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int tar = scanner.nextInt();
        int count = 0;

        int dp[] = new int[tar + 1];
        dp[0] = 1;

        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i]; j < dp.length; j++) {
                dp[j] += dp[j - arr[i]];
            }
        }


        System.out.println(dp[tar] );

    }

}
