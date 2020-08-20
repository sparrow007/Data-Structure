package programs.Recursions.GFG;

import java.util.Scanner;

public class SequencePattern {

    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test > 0) {
            int n = scanner.nextInt();
            System.out.print(n + " ");
            calculate(n-5, n, n-5);
            test--;
        }
    }

    public static void calculate(int n, int ans, int inc) {

        System.out.print(n + " ");
        if(n == ans) {
            return;
        }
        if(inc > 0){
            calculate(n-5, ans, inc-5);
        }
        else {
            calculate(n+5, ans, inc-5);
        }

    }
}
