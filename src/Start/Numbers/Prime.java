package Start.Numbers;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int t = scn.nextInt();
        while (t-- > 0) {
            int n = scn.nextInt();
            int flag = 0;
            if (n == 1) {
                System.out.println("prime");
                continue;
            }
            for (int i = 2; i <= n/2; i++) {
                if (n % i == 0) {
                    System.out.println("not prime");
                    flag = 1;
                    break;
                }
            }

            if (flag == 0) {
                System.out.println("prime");
            }
        }
    }
}
