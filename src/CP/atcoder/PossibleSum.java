package CP.atcoder;

import java.util.Scanner;

public class PossibleSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();

        if (l % 3 == 0) {
            int decimalValue = l / 3;
            decimalValue = decimalValue * decimalValue * decimalValue;
            System.out.println(String.format("%.12f", (float)decimalValue));
        }else {
            float decimalValue = l / 3f;
            decimalValue = decimalValue * decimalValue * decimalValue;
            System.out.println(String.format("%.12f", decimalValue));
        }

    }
}
