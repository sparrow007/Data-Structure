package programs.Arrays;

import java.util.Scanner;

public class TwoDArray {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int [][] arr = new int[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
