package programs.Arrays;

import java.util.Scanner;

public class WaveTraversal {

    public static void main(String ars[]) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int a[][] = new int[row][column];

        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        //For the wave traversal we need to seet that total row and move through other column
        for(int i =0 ;  i < column; i++) {
            for(int j = 0; j < row; j++) {
                System.out.println(a[j][i]);
            }
        }

    }
}
