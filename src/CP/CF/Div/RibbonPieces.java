package CP.CF.Div;

import java.util.Arrays;
import java.util.Scanner;

public class RibbonPieces {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long a = scanner.nextLong();
        long b = scanner.nextLong();
        long c = scanner.nextLong();

        System.out.println(getMaxRibbon(n, a, b,c));

        }

    long[] value = new long[10000000];

    static int getMaxRibbon(long n, long a, long b, long c) {
        if (n == 0)
            return 0;

        if (n < 0) return Integer.MIN_VALUE;



        return 1 + Math.max(getMaxRibbon(n-a, a, b, c), Math.max(getMaxRibbon(n-b, a, b,c), getMaxRibbon(n-c, a, b,c)));
    }

}
