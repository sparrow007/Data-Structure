package CP.CF.Div;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long a = scanner.nextLong();
        long b = scanner.nextLong();

        String s = String.valueOf(a);

        while (b != 0) {
            int r = (int) (b % 10);
            b = b / 10;
            if (!s.contains(String.valueOf(r))) {
                System.out.println("NO");
                return;
            }

        }

        System.out.println("YES");

    }

}
