package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class ReverseArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        recursiveReverse(arr, 0 , n-1);

        for (int element : arr) System.out.print(element + " ");

    }

    static void recursiveReverse(int arr[], int start, int end) {
        if(start > end) return;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        recursiveReverse(arr, start + 1, end - 1);

    }

    static void iterativeReverse(int arr[], int left, int right) {
        while(left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
