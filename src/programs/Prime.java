package programs;

import java.util.Scanner;

public class Prime {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = scanner.nextInt();

        //Smallest prime number is 2 so it should controll the value for 1

        for (int i = 2; i*i < a; i++) {
            if(a % i == 0 ) {
                System.out.println("Prime number");
                return;
            }
        }

        System.out.println("Not a prime number");

    }
}