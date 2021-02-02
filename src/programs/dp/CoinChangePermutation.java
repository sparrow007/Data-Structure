package programs.dp;


import java.util.Scanner;

public class CoinChangePermutation {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int tar = scanner.nextInt();

        int[] dp = new int [tar + 1];

        dp[0] = 1;

        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[j] <= i) {

                    dp[i] += dp[i - arr[j]];

                }

            }
        }

        System.out.println(dp[tar]);


    }
}
