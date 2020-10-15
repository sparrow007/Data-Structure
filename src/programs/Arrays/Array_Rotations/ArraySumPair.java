package programs.Arrays.Array_Rotations;

import java.util.Scanner;

public class ArraySumPair {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int key = scanner.nextInt();

        System.out.println(isSumPairExist(arr, n, key));

    }

    static int isSumPairExist(int[] arr, int n, int sum) {

        int i = 0;

        for ( i = 0; i < n-1; i++) {
            if(arr[i] > arr[i+1]) break;
        }

        int l = (i + 1) % n;

        int r = i;

        int cnt = 0;

        while (l != r) {

            int tempSum = arr[l] + arr[r];

            if(tempSum == sum) cnt++;

            if(tempSum > sum) {
                r = (n + r - 1) % n;
            }else {
                l = (l + 1) % n;
            }

        }
        return cnt;
    }

}
