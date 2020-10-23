package programs.Arrays.Optimizations;

import java.util.Scanner;

public class MaximumDifference {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        System.out.println(maxElementDiff(arr, 0, n -1));
    }

    static int maxDiff(int[] arr, int n) {
        int maxDiff = arr[1] - arr[0];
        int minElement = arr[0];

        for (int i = 1; i < n; i++) {
            if(arr[i]-minElement > maxDiff) {
                maxDiff = arr[i]-minElement;
            }

            if(arr[i] < minElement) {
                minElement = arr[i];
            }
        }

        return maxDiff;
    }

    static int maxElementDiff(int[] arr, int start, int end) {

        if(start >= arr.length) return 0;

        int maxElement = arr[end];
        int maxDiff = Integer.MIN_VALUE;

        for (int i = end - 1; i >= start; i--) {

            if(arr[i] > maxElement) {
                maxElement = arr[i];
            }else {
                int diff = maxElement - arr[i];
                if(diff > maxDiff) maxDiff = diff;
            }

        }
        return maxDiff;
    }
}
