package programs.Recursions;

import java.util.Scanner;

public class TowerOfHanoi {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        tower(n, a, b, c);
    }

    public static void tower(int n, int a, int b, int c) {
        if(n == 0) {
            return;
        }
        tower(n-1, a, c, b);
        System.out.println(n + "[" + a + " -> "+b + "]");
        tower(n-1, c,b, a);
    }
}
