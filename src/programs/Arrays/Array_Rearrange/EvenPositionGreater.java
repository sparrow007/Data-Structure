package programs.Arrays.Array_Rearrange;

import java.util.Arrays;
import java.util.Scanner;

public class EvenPositionGreater {


    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test--> 0) {

            int n = scanner.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

           int[] ans = evenOdd(arr, n);

            rearrangeEvenOdd(arr, n);

            System.out.println(arr.length);
            for (int element : ans) System.out.print(element + " ");

            System.out.println();

        }
    }

   static int[] evenOdd(int arr[], int n) {
        Arrays.sort(arr);

        int[] ans = new int[n];
        int start = 0;
        int end = n - 1;

        for (int i = 0; i < n; i++) {

            if((i % 2) != 0) {
                ans[i] = arr[end--];
            }else {
                ans[i] = arr[start++];
            }

        }
        return ans;
    }

   static void rearrangeEvenOdd(int[] arr, int n) {

        for (int i = 0; i < n-1; i++) {

            if(i % 2 != 0) {
                if(arr[i] < arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                if(arr[i-1] > arr[i] ){
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }

    }

}
