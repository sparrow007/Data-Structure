package programs.Arrays.Array_Rotations;

import java.util.Scanner;

public class MaxiMumArrayIndex {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

       // rotateArray(arr, 3);

        System.out.println( findMaximumSum(arr));

    }

    static int findMaximumSum(int arr[]) {

        int max = Integer.MIN_VALUE;
        int rotation = 0;

       for(int i = 0; i < arr.length; i++) {
           if(arr[i] > max) {
               max = arr[i];
               rotation = i;
           }
       }

       rotateArray(arr, rotation  + 1);

       int sum = 0;
      for (int i = 0; i < arr.length; i++) {
          sum += (i * arr[i]);
      }

       return  sum;
    }

    static void rotateArray(int[] arr, int d) {

        int length = arr.length;
        int j = 0;
        int k = 0;

        for (int i = 0; i < gcd(length, d); i++) {

            j = i;
            int temp = arr[i];
            while (true) {
                k = (j + d) % length;

                if(k == i) break;

                arr[j] = arr[k];
                j = k;

            }
           arr[j] = temp;
        }

    }

    static int gcd(int a, int b) {
        if(a == 0) return b;

        return gcd(b % a , a);
    }

}
