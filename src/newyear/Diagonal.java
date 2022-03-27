package newyear;
import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.Scanner;

public class Diagonal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int row = scn.nextInt();
        int col = scn.nextInt();
        int[][] mat = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scn.nextInt();
            }
        }


        for (int i = 0; i < col; i++) {
            int diagonal = i;
            for (int j = 0; j < row && diagonal < col; j++, diagonal++) {
                System.out.println(mat[j][diagonal]);
            }
        }
    }
}
