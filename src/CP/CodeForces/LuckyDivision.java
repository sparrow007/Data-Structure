package CP.CodeForces;

import java.util.Scanner;

public class LuckyDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        System.out.println(799 % 47);

        if (String.valueOf(num).contains("47")) {
            System.out.println("YES");
            return;
        }

        int div = num % 4 == 0 ? 2 : 3;
        if (div % 2 == 0) {
            System.out.println("YES");
            return;
        }

        div =  num % 7 == 0? 2: 3;
        if (div % 2 == 0) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");

    }
}
