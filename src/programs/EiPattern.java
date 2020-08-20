package programs;

import java.util.Scanner;

public class EiPattern {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for(int i  = 0 ; i < n; i++) {

            for (int j = 0; j < 2*i; j++) {
                System.out.print("  ");
            }

            for(int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}
