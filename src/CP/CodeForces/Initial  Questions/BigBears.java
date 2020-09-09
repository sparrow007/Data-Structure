package CP.CodeForces;

import java.util.Scanner;

public class BigBears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int l = scanner.nextInt();
        int b = scanner.nextInt();

        int years = 0;

        while (true) {
            years++;
            l = l * 3;
            b = b * 2;

            if (l > b)
                break;
        }

        System.out.println(years);
    }
}
