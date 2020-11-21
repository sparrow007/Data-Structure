package CP.atcoder;

import java.util.Scanner;

public class equation {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        int s = 0;
        for (int i = 1; i <= number; i++) {
            s += (number-1)/i;
            System.out.println((number-1)/i);
        }
        System.out.println(s);

    }
}
