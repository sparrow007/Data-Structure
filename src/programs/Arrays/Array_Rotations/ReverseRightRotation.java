package programs.Arrays.Array_Rotations;

import java.util.Scanner;

public class ReverseRightRotation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int d = scanner.nextInt();
        n--;

        reverseArray(arr, 0, n - d);
        reverseArray(arr, n -d + 1, n);
        reverseArray(arr, 0 , n);

        for (int data : arr) System.out.print(data + " ");
    }

    static void reverseArray(int arr[], int left, int right) {

        while(left < right) {

            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;

        }

    }

}
