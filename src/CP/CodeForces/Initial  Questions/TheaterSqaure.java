package CP.CodeForces;

import java.util.Scanner;

public class TheaterSqaure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int a = scanner.nextInt();

        int nSides = n % a == 0 ? n / a : n / a + 1;
        int mSides =  m % a == 0 ? m / a : m / a + 1;

        int totalStones = nSides * mSides;
        System.out.println(totalStones);
    }
}
