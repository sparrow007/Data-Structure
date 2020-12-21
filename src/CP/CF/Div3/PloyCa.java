package CP.CF.Div3;

import java.util.Scanner;

public class PloyCa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {

            int length = scanner.nextInt();

            long[] a = new long[length];

            for (int i = 0; i < length; i++) a[i] = scanner.nextInt();

            long[] out = new long[length];

            int start  = 0;
            int end = length - 1;

            while (start < end) {

                System.out.print(a[start] + " ");
                System.out.print(a[end] + " ");

                start++;
                end--;
            }
            if (length % 2 != 0)
            System.out.print(a[start]);
            System.out.println();
        }
    }
}
