package programs.Recursions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class MatrixRecur {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[][] matrix = {{1, 1, 1, 1, 1, 1, 1, 1},
                {1, 1, 1, 1, 1, 1, 0, 0},
                {1, 0, 0, 1, 1, 0, 1, 1},
                {1, 2, 2, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 0, 1, 0},
                {1, 1, 1, 2, 2, 2, 2, 0},
                {1, 1, 1, 1, 1, 2, 1, 1},
                {1, 1, 1, 1, 1, 2, 2, 1},
        };



        int x = 1;
        int y = 0;

        int val = 3;

//        int[][] a  = calculateIndex(matrix, x, y, matrix[x][y], val);
//
//        for (int i = 0; i < a.length; i++){
//            for (int j = 0; j < a[0].length; j++) {
//                System.out.print(a[i][j] + " ");
//            }
//            System.out.println();
//        }

        matrixTrav(matrix, 0, 0);

    }

    public static int[][] calculateIndex(int[][]matrix, int x, int y, int c, int val) {
        if(x < 0 || y < 0 || x >= matrix.length || y >= matrix[0].length || matrix[x][y] != c) {
            return matrix;
        }else if(matrix[x][y] == c){
            matrix[x][y] = val;
        }

        matrix =  calculateIndex(matrix, x + 1, y, c, val);
        matrix =  calculateIndex(matrix, x - 1, y,c, val);
        matrix =  calculateIndex(matrix, x, y + 1, c, val);
        matrix = calculateIndex(matrix, x, y - 1, c, val);
        return matrix;

    }

    static void matrixTrav(int[][]a, int row, int col) {

        if(row >= a.length) {
            return;
        }

        if(col < a[0].length) {
            System.out.print(a[row][col] + " ");
            matrixTrav(a, row, col + 1);
        }else {
            System.out.println();
            matrixTrav(a, row + 1, 0);
        }

    }

    public static void triverse(int[][] arr,int c,int r){
        if(r>=arr.length){
//            if(r>=arr.length){
//                System.out.println();
//                return;
//            }
            return;
        }



        if(c<arr[0].length)
        {System.out.print(arr[r][c]+" ");
            triverse(arr,c+1,r);
        }
        else if(r<arr.length){
            c=0;
            System.out.println();
            triverse(arr,c,r+1);

        }

    }
}
