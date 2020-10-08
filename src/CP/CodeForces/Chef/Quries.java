package CP.CodeForces.Chef;

import java.util.Scanner;

public class Quries {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while (test--> 0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            long[]a = new long[n];

            for (int i = 0; i < n; i++) a[i] = scanner.nextLong();

            long firstDay = 0;
            long  carry = 0;
            for (int i = 0 ; i < n; i++) {

                a[i] += carry;

                if(a[i] < k) {
                    firstDay = i+1;
                    break;
                }

                carry = a[i] - k;

                System.out.println("carry " + carry);
            }

            if(firstDay == 0) {
                firstDay = n+1;
                firstDay += carry / k;
            }

            System.out.println(firstDay);
        }

    }
}
