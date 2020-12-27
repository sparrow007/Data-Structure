package CP.codeChef;

import java.util.Scanner;

public class SedSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test;
        test = scanner.nextInt();
        while (test--> 0) {

            int length = scanner.nextInt();
            int number = scanner.nextInt();

            if (length % number == 0) {
                System.out.println(0);
            }else {
                System.out.println(1);
            }

        }
    }
}
