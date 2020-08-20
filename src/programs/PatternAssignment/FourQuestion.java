package programs.PatternAssignment;

import java.util.Scanner;

public class FourQuestion {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();

        int n = (a +  a - 1);
        int half = n / 2;

        for(int i = 0; i < n; i++) {

            if(i <= half) {
                for(int j = 0; j < half-i; j++) {
                    System.out.print("  ");
                }

                for(int j = 0; j <= i; j++) {
                    System.out.print("* ");
                }

            }else {
                for(int j = 0; j < i - half; j++) {
                    System.out.print("  ");
                }

                for(int j = i-half; j < a; j++) {
                    System.out.print("* ");
                }
            }

            System.out.println();

        }

    }
}