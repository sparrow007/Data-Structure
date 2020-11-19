package CP.CF.Div;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Barrels {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-->0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            Integer a[] = new Integer[n];

            for (int i = 0; i < n; i++) a[i] = scanner.nextInt();

            Arrays.sort(a);
            Collections.reverse(Arrays.asList(a));

            long sum = a[0];
            for (int i = 1; i <= k; i++) {
                sum += a[i];
            }

            System.out.println(sum);


        }
    }

}
