package programs.Recursions;

import java.util.Scanner;

public class LogPower {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.print(callPower(x, n));

    }

    public static int callPower(int x, int n) {
        if(n == 1)
            return  x;
        int xp2 = callPower(x, n / 2);

        int xn = xp2 * xp2;

        if(n % 2 == 1) xn = xn * x;

        return xn;
    }
}
