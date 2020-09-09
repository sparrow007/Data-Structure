package CP.CodeForces;

import java.util.Scanner;

public class LuckyDivision {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt();

        if (isDivision(num))
        System.out.println("YES");
        else
        System.out.println("NO");

    }

    public static boolean isDivision(int num) {

        if (num % 4 == 0 || num % 7 == 0 || num % 47 == 0) return true;

        String number = String.valueOf(num);
        number = number.replaceAll("7", "");
        number = number.replaceAll("4", "");

        return number.length() == 0;

    }
}
