package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class DifferencePositiveNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        rearrangeDifference(arr, n);

        for(int element : arr) System.out.print(element + " ");
    }

    private static void rearrangeDifference(int[] arr, int n) {

        for (int i = n-1; i >= 0 ; i--) {
            int j = i;
           while( (j + 1) < n && arr[j + 1] < 0) {
               j++;
           }

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

        }

    }


}
