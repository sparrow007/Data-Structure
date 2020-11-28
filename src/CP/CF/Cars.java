package CP.CF;

import java.util.Scanner;

public class Cars {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {

            int n = scanner.nextInt();

            int[]a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = scanner.nextInt();

            int sum = a[0];

            int pt = a[0];
            for (int i = 1; i < n; i++, pt--){

                if (pt ==0) break;

                pt += a[i];
                sum += a[i];

            }

            System.out.println(sum);

        }
    }
}
