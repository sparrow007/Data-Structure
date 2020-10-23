package programs.Arrays.Optimizations;

import java.util.Scanner;

public class KadanesAlgorithm {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);


        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();
        int maxSum = kadensAlgo(arr, n);
        System.out.println(maxSum);
    }

    static int maxSum(int arr[], int n) {
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int subArraySum = arr[i];
            maxSum = Math.max(subArraySum, maxSum);

            for (int j = i + 1; j < n; j++) {
                subArraySum += arr[j];
                maxSum = Math.max(subArraySum, maxSum);
            }
        }
        return maxSum;
    }

   static int kadensAlgo(int[] arr, int n) {
        int max_so_far = Integer.MIN_VALUE;
        int max_ends_here = 0;

        int start = 0, s = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            max_ends_here += arr[i];
            if(max_ends_here > max_so_far) {
                max_so_far = max_ends_here;
                start = s;
                end = i;
            }

            if (max_ends_here < 0) {
                max_ends_here = 0;
                s = i + 1;
            }
        }

      // System.out.println("start = " + start + " end = " + end);

        return max_so_far;
    }
}
