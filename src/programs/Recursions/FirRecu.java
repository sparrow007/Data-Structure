package programs.Recursions;

import java.util.Scanner;

public class FirRecu {
    static int sum  = 0;
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        callInc(n);
    }

    public static int calN(int n) {
        if( n == 1) {
            return 1;
        }else{
            return n + calN(n-1);
        }
    }

    public static void calDec(int n) {

        if(n==0) {
            return ;
        }

        System.out.println(n);
        calDec(n-1);

    }

    public static void callInc(int n) {
        if(n ==0) return;

        callInc(n-1);
        System.out.println(n);
    }
}
