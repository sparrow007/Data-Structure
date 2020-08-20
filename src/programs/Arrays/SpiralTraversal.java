package programs.Arrays;

import java.util.Scanner;

public class SpiralTraversal {

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
        int maxr = a.length - 1;
        int maxc = a[0].length - 1;
        int total = row * column;
        int cnt = 0;

        while(cnt < total) {

            //Left wall
            for(int i = minr; i <= maxr && cnt<total; i++) {
                cnt++;
                System.out.println(a[i][minc]);
            }
            minc++;

            //Bottom wall
            for(int j = minc; j <= maxc && cnt < total; j++) {
                cnt++;

                System.out.println(a[maxr][j]);
            }
            maxr--;
            //Right wall
            for(int k = maxr; k >= minr && cnt < total; k--) {
                cnt++;
                System.out.println(a[k][maxc]);
            }
            maxc--;
            //Top wall
            for(int j = maxc; j >= minc && cnt < total; j--) {
                cnt++;
                System.out.println(a[minr][j]);
            }
            minr++;
        }

    }
}
