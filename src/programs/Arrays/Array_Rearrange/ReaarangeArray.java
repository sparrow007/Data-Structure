package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class ReaarangeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        reArrangeValues(arr, n);

//       int[] temp =  reArrange(arr, n);
//
//        for (int element : temp)
//        System.out.print(element + " ");

    }

    static int[] reArrange(int[] arr, int n) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[arr[i]] = i;
        }
       return temp;
    }

    static void reArrangeUtils(int[] arr, int start) {
        int val = -(start + 1);
        int i = arr[start];

        while(arr[start] > 0) {

            int new_i = arr[i];

            arr[i] = val;

            val = -(i + 1);
            i = new_i;

        }

    }

    static void reArrangeArray(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            reArrangeUtils(arr, i);
        }

         for (int element : arr)
        System.out.print(-(element + 1) + " ");

    }

    static void reArrangeValues(int[] arr, int n) {

        for (int i = 0; i < n; i++) {
            arr[arr[i] % n] += i*n;
        }

        for (int i = 0; i < n; i++) {
            arr[i] /= n;
        }

        for (int element : arr)
            System.out.print(element + " ");

    }
}
