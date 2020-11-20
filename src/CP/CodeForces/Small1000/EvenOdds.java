package CP.CodeForces.Small1000;

import java.util.ArrayList;
import java.util.Scanner;

public class EvenOdds {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long k = scanner.nextLong();

        long index = (n % 2 == 0) ? (n/2) : (n/2) + 1;

        if(k <= index) System.out.println((2*(k) - 1));
        else System.out.println((2*(k - index)));

    }
}
