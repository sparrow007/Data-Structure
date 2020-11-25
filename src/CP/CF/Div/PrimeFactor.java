package CP.CF.Div;

import java.util.Scanner;

public class PrimeFactor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        long test = scanner.nextLong();

        while (test-->0) {
            long a = scanner.nextLong();
            long divisor = 2;
            for (long i = 2; i <= Math.ceil(Math.sqrt(a)); i++) {
                if (divisor > 3) break;
                if (a % i == 0) {

                    if (a/i == i)
                        divisor++;
                    else
                        divisor += 2;

                }
            }
            if (divisor == 3) System.out.println("YES");
            else System.out.println("NO");
        }

    }
}
