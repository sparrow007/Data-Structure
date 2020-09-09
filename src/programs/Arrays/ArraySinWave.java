package programs.Arrays;

import java.util.Scanner;

public class ArraySinWave {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();

        int[][]mat = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                mat[i][j] = scanner.nextInt();

        if (mat.length == 0) return;

        for (int i = 0; i < mat[0].length;i++)
        {
            if (i % 2 == 0) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.print(mat[j][i] + " ");
                }
            }else {
                for (int j = mat.length-1; j >= 0; j--) {
                    System.out.print(mat[j][i] + " ");
                }
            }
        }

    }
}
