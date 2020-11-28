package CP.atcoder;

import java.util.Scanner;

public class ChoclateFloder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int h = scanner.nextInt();
        int v = scanner.nextInt();

        int k = scanner.nextInt();

        int [][]cho = new int[h][v];

        for (int i= 0; i < h; i++) {
            for (int j = 0; j < v; j++) {
                cho[i][j] = scanner.nextInt();
            }
        }

        int minFirst = Math.min(h, v);

        int maxSecond = Math.max(h,v);

        long division = 0;

        long count = 0;

        long counter = 0;

        for (int i = 0; i < h; i++) {

            for (int j = 0; j < v; j++) {
                if (cho[i][j] == 1) counter++;
            }


            if (count  + counter > k) {
             //   System.out.println(count + " count " + counter);
                count = counter;
                counter = 0;


                division++;

            }else {
                count += counter;
                counter = 0;
            }
        }

        System.out.println(division == k ? k - 1 : division);
    }
}
