package programs.Arrays;

import java.util.Scanner;

public class ReverseSpiral {

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

        int minr = 0;
        int minc = 0;
        int maxr = a.length-1;
        int maxc = a[0].length - 1;
        
        int total = row * column;
        int cnt = 0;
        while( cnt < total) {

            //Top
            for (int i = minc, j = minr; i <= maxc && cnt < total; i++){
                cnt++;
                System.out.println(a[j][i]);
            }
            minr++;

            //Right wall
            for (int i = minr, j = maxc; i <= maxr && cnt < total; i++) {
                cnt++;
                System.out.println(a[i][j]);
            }
            maxc--;
            //Bottom wall
            for (int i = maxc, j = maxr; i >= minc && cnt < total; i--) {
                cnt++;
                System.out.println(a[j][i]);
            }
            maxr--;
            //Left wall
            for(int i = maxr, j = minc; i >= minr && cnt < total; i--) {
                cnt++;
                System.out.println(a[i][j]);
            }
            minc++;
        }

    }
}
