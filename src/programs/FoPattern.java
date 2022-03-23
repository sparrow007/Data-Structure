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

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int n2 = scanner.nextInt();
        int arr2[] = new int[n2];

        for (int i = 0; i < n2; i++) {
            arr2[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }

    }
}
