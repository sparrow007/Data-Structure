package programs.Arrays;

import java.util.Scanner;

public class SellShift {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int arr[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int shell = scanner.nextInt();
        int rotation = scanner.nextInt();

        int minr = shell-1;
        int minc = shell-1;
        int maxr = (arr.length-1)-minr;
        int maxc = (arr[0].length-1)-minr;

        while(rotation>0) {

            int temp = arr[minr][minc];

            //Top wall shifting
            for(int i = minc, j = minr; i < maxc; i++) {
                arr[j][i] = arr[j][i+1];
            }

            //Right wall shifting
            for(int i = minr, j = maxc; i < maxr; i++)
                arr[i][j] = arr[i+1][j];

            //bottom wall shifting
            for(int i = maxc, j = maxr; i > minc; i--) {
                arr[j][i] = arr[j][i-1];
            }

            //left wall shifting
            for(int i = maxr, j = minc; i > minr+1; i--) {
                arr[i][j] = arr[i-1][j];
            }

            arr[minr+1][minc] = temp;

            rotation--;
        }

        for(int i =0 ; i < row; i++) {
            for(int j = 0; j < column; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
