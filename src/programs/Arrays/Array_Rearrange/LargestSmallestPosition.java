package programs.Arrays.Array_Rearrange;

import java.util.Arrays;
import java.util.Scanner;

public class LargestSmallestPosition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int[] ans = evenOdd(arr, n);

        for(int element : ans) System.out.print(element + " ");

    }

    static int[] evenOdd(int arr[], int n) {
        Arrays.sort(arr);

        int[] ans = new int[n];
        int start = 0;
        int end = n - 1;

        for (int i = 1, j = 0; i < n || j < n; i+= 2, j+= 2) {

            if(i < n)
            ans[i] = arr[end--];
            if(j < n)
            ans[j] = arr[start++];

        }
        return ans;
    }
}
