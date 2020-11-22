package CP.atcoder;

import java.util.Scanner;

public class TravelingSalemen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        int h = scanner.nextInt();

        int a[] = new int[h];

        for (int i = 0; i < h; i++) a[i] = scanner.nextInt();


        int distance = k - a[h-1] + a[0];

        int totalDistance = 0;

        if (distance <= Math.abs(a[0] - a[1])) {
            int i = h;
            while (i != h % i) {



                i++;
            }
        }

    }
}
