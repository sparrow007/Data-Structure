package programs.Arrays;

import java.util.Scanner;

public class MatrixTransform {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = row;

        int arr[][] = new int[row][column];

        for(int i = 0; i  < row; i++) {
            for(int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        //Transpose of a matrix
        for(int i = 0; i < row; i++) {
            for(int j = i+1; j < column; j++) {
                int temp = arr[j][i];
                arr[j][i] = arr[i][j];
                arr[i][j] = temp;
            }
        }

        //Reverse the matrix
        for(int i =0; i < column/2;i++)
         for(int j = 0; j < row; j++) {
            int columnIndex = (column-1)-i;
            int temp = arr[j][columnIndex];
             arr[j][columnIndex] = arr[j][i];
             arr[j][i] = temp;
         }

        for(int i =0; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
