package programs;

import java.util.Scanner;

public class Fibonacci {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = 0;
        int b = 1;
        int c = 0;
        if( n == 0) {
            System.out.println(a);
        }
        if(n == 1) {
            System.out.println(b);
        }
        for (int i = 0; i < n-2; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println(c);
    }
}
