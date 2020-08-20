package programs.PatternAssignment;

import java.util.Scanner;

public class FiQuestion {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = (a + a +1);
        int half = n/2;
        for (int i = 0; i < half; i++) {
                for (int j = 0; j < a-i; j++) {
                    System.out.print("* ");
                }

                for (int j = 0; j < (2*i + 1); j++) {
                    System.out.print("  ");
                }

                for (int j = 0; j < a-i; j++) {
                    System.out.print("* ");
                }

            System.out.println();

        }

        System.out.println();

        for (int i = a-1; i >= 0; i--) {

            for (int j = i; j < a; j++) {
                System.out.print("* ");
            }

            for (int j = 0; j < (2*i + 1); j++) {
                System.out.print("  ");
            }

            for (int j = i; j < a; j++) {
                System.out.print("* ");
            }

            System.out.println();

        }

    }
}