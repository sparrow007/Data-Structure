package CP.CodeForces;

import java.util.Scanner;

public class SoilderBanans {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int n = scanner.nextInt();
        int w = scanner.nextInt();

        int totalMoney =0;
        for (int i = 1; i <= w; i++ ) {
            totalMoney += i * k;
        }
        int borrow = totalMoney - n;
        System.out.println(Math.max(0, borrow));
    }
}
