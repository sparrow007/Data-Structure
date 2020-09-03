package CP.CodeForces;

import java.util.Scanner;

public class BitPlus {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine();
        int x = 0;

        while (n --> 0) {
            String operation = scanner.nextLine();
            x += operation.contains("+") ? 1 : -1;
        }
        System.out.println(x);
    }
}
