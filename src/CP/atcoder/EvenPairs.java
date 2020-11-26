package CP.atcoder;

import java.util.Scanner;

public class EvenPairs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int m = scanner.nextInt();

        n = n -1;
        m= m - 1;

        int nValues = (n*(n + 1) / 2);
        int mValues = (m*(m + 1)/ 2);

        System.out.println(nValues + mValues);

    }

    static int getValue(int n) {
        int values = 0;
        for (int i = n-1; i >= 1; i--) {
            values += i;
        }
        return values;
    }
}
