package programs.Arrays.Array_Rotations;

import java.util.Scanner;

public class PrintLeftRotation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int k = scanner.nextInt();

        for (int i = k; i < k + n; i++) {
            System.out.print(arr[i % n] + " ");
        }

    }

}
