package programs.dp;

import java.util.Scanner;

public class OneDUnboundedKnapSack {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) value[i] = scanner.nextInt();

        for (int i = 0; i < n; i++) weight[i] = scanner.nextInt();

        int cap =scanner.nextInt();
        System.out.println(combinationSolution(weight, value, cap));

    }

    static int permutationSolution(int[]weigt, int[] value, int cap) {
        int dp[] = new int[cap+1];

        for (int i = 1; i <= cap; i++) {
            int max = 0;
            for (int j = 0; j < weigt.length; j++) {
                if (weigt[j] <= i) {
                    int element = value[j] + dp[i - weigt[j]];
                    max = Math.max(element, max);
                }
            }
            dp[i] = max;
        }
        return dp[cap];
    }

    static int combinationSolution(int[]weigt, int[] value, int cap) {
        int dp[] = new int[cap+1];

        for (int i = 0; i < weigt.length; i++) {

            for (int j = 1; j < dp.length; j++) {
                if (weigt[i] <= j) {
                    int max = value[i] + dp[j - weigt[i]];
                    dp[j] = Math.max(dp[j], max);
                }
            }

        }

        return dp[cap];
    }
}
