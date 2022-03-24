package programs;

import java.util.Scanner;

public class FoPattern {


    public static void main(String args[]) {
      //  Scanner scanner = new Scanner(System.in);
       // int n = scanner.nextInt();

/**
 *     Scanner scn = new Scanner(System.in);
 *     int row = scn.nextInt();
 *     int col = scn.nextInt();
 *     int[][] mat = new int[row][col];
 *
 *     for (int i = 0; i < row; i++) {
 *            for (int j = 0; j < col; j++) {
 *              mat[i][j] = scn.nextInt();
 *            }
 *     }
 */
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        int prev = arr[0];
        for (int i = 1; i <= n; i++) {
            int currentIndex = i % n;
            int temp = arr[currentIndex];
            arr[currentIndex] = prev;
            prev = temp;
        }

        for (int i = 0; i < n; i++)
        System.out.print(arr[i] + " ");
    }
}
