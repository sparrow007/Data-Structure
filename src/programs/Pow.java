package programs;

import java.util.Scanner;

public class Pow {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = scanner.nextInt();

        System.out.println("Enter b = ");
        int b = scanner.nextInt();

        int c = 1;

        for (int  i = 1; i <= b; i++) {
            c = c * a;
        }

        System.out.println(c);
    }
}
