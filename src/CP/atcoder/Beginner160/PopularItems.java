package CP.atcoder.Beginner160;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class PopularItems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        Integer[] a= new Integer[n];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            sum += a[i];
        }


        Arrays.sort(a, Collections.reverseOrder());

        long minimum = (long) Math.ceil(sum / (4f*m));


        for (int i = 0; i < m; i++) {

            if (a[i] < minimum) {
                System.out.println("No");
                return;
            }

        }

        System.out.println("Yes");
    }
}
