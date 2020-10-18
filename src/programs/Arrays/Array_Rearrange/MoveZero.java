package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class MoveZero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        moveZeroSinglePass(arr, n);

//       arr =  moveZeroWithArray(arr, n);
//
        for(int element : arr) System.out.print(element + " ");
    }

    static int[] moveZeroWithArray(int[]arr, int n) {
        int ans[] = new int[n];

        for (int i = 0, j = 0; i < n; i++) {
            if(arr[i] != 0) {
                ans[j] = arr[i];
                j++;
            }
        }

       // for (int element : ans) System.out.print(element + " ");

        return ans;
    }

    static void moveZero(int arr[], int n) {
        if(n == 1) return;

        int start = 0, end = 1;

        while(start < n && end < n) {

            if(arr[start] == 0 && arr[end] != 0) {
                arr[start] = arr[end];
                arr[end] = 0;

                start++;
                end++;
            }else if(arr[start] != 0) {
                start++;
                end = start + 1;
            }else if(arr[end] == 0) {
                end++;
            }

        }
    }

    static void moveZeroToRight(int arr[], int n) {

        int count = 0;

        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < n) {
            arr[count++] = 0;
        }

    }

    static void moveZeroSinglePass(int arr[], int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arr[i] != 0) {
                int temp = arr[count];
                arr[count] = arr[i];
                arr[i] = temp;
                count++;
            }
        }


    }
}
