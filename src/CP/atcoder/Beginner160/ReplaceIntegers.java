package CP.atcoder.Beginner160;

import java.util.Scanner;

public class ReplaceIntegers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        long k = scanner.nextLong();

        long value = n;

        for (long i = 0; i < value; i++) {

            if (Math.abs(n-k) > n) {
                System.out.println(n);
                break;
            }else {
                n = Math.abs(n - k);
            }

        }

    }
}
