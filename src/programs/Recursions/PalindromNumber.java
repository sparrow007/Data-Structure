package programs.Recursions;

import java.util.Scanner;

public class PalindromNumber {

    private static int fact = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        reverse(n);
    }

    public static int reverse(int n){

        if(n==0){
            return 0;
        }
        int rem=n%10;

        fact=fact*10+rem;
        reverse(n/10);
        System.out.println(fact);
        return fact;
    }
}
