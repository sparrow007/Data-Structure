package programs.Arrays.Array_Rotations;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySum {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int key = scanner.nextInt();

        Arrays.sort(arr);

        int start = 0;
        int end = n - 1;

        while ( start < end) {

           int sum = arr[start] + arr[end];

           if(key == sum) {
               System.out.println(arr[start] + " " + arr[end]);
               return;
           }

           if(key < sum) {
               end--;
           }else
               start++;

        }

        System.out.println(-1);
    }
}
