package CP.CF.Div;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {

      Scanner scanner = new Scanner(System.in);

       long a = scanner.nextLong();
       long b = scanner.nextLong();

       int[] first = new int[10];
       int[] second = new int[10];

        long diff = b - a;

        if (diff < 0) {
            System.out.println("NO");
            return;
        }

        String firstValue = String.valueOf(a);
        String secondValue = String.valueOf(diff);

        while (a != 0) {
            int r = (int) (a % 10);
            a = a / 10;
            first[r]++;
        }

        while (diff != 0) {
            int r = (int) (diff % 10);
            diff = diff / 10;
            second[r]++;
        }


        if (firstValue.length() == secondValue.length()) {

            for (int i = 0; i < 10; i++) {
                if (first[i] != second[i]) {
                    System.out.println("NO");
                    return;
                }
            }

            System.out.println("YES");

        }else {
            System.out.println("NO");
        }

    }
}
