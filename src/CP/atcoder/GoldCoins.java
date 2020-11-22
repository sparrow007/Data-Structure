package CP.atcoder;

import java.util.Scanner;

public class GoldCoins {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long yen = scanner.nextLong();

        long happiness = 0;
        long high = yen / 500;
        if (high > 0) {
            happiness = 1000* high;
        }

        yen = yen - 500 * high;

        high = yen / 5;
        if (high > 0) {
            happiness += 5 * high;
        }

        System.out.println(happiness);


    }
}
