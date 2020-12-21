package CP.CF.Div;

import java.util.Scanner;

public class Division {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {

            long p = scanner.nextLong();
            long q = scanner.nextLong();

            if (p % q != 0) {
                System.out.println(p);
            }else {

                long j = Math.min(p, q);
                for (; j > 0; j--) {
                    if (p % j == 0 && q % j != 0) {
                        System.out.println(j);
                        break;
                    }
                }

            }

        }
    }
}
