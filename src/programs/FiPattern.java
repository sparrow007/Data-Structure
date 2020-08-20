package programs;

import java.util.Scanner;

public class FiPattern {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count = 1;

        for(int i = 0; i < n; i++) {

            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }

            for (int j = 0; j <= i; j++, count++) {
                System.out.print(count +"  ");
            }
            System.out.println();
        }

    }
}
