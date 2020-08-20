package programs.Arrays;

import java.util.Scanner;

public class ArrayMul {
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

        int row1 = scanner.nextInt();
        int column1 = scanner.nextInt();
        int [][] arr1 = new int[row1][column1];

        for(int i = 0; i < row1; i++) {
            for(int j = 0; j < column1; j++) {
                arr1[i][j] = scanner.nextInt();
            }
        }

        //For the matrix multiplication column of first matrix must equal to row of second matrix

        if(column != row1) {
            System.out.println("Matrix can't be multiply");
            return;
        }
        int mul[][] = new int[row][column1];
        //If condition for matrix is matched then new matrix has row of first * column of second matrix
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < column1; j++) {
                for(int k = 0; k < column; k++) {
                    mul[i][j] += arr[i][k] * arr1[k][j];
                }
            }
        }

        for(int i =0; i < row; i++) {
            for (int j = 0; j < column1; j++) {
                System.out.print(" " + mul[i][j]);
            }
            System.out.println();
        }

    }
}
