package CP.CodeForces;

import java.util.Scanner;

public class NearLucky {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long num = scanner.nextLong();

        if (isDivision(num))
            System.out.println("YES");
        else
            System.out.println("NO");

    }

    public static boolean isDivision(long num) {

     String numbers = String.valueOf(num);
     long count = numbers.chars().filter(c -> c == '4' || c== '7').count();
     return count > 0 && (count % 4 == 0 || count % 7 == 0);
    }
}
