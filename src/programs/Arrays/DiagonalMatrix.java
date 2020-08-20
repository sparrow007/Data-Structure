package programs.Arrays;

import java.util.Scanner;

public class DiagonalMatrix {

    public static void main(String ars[]) {
        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int a[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = scanner.nextInt();
            }
        }



    }
}
