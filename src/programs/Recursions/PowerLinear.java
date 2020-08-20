package programs.Recursions;

import java.util.Scanner;

public class PowerLinear {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int n = scanner.nextInt();

        System.out.print(callPower(x, n));

    }

    public static int callPower(int x, int n) {
        if(n == 0)
            return  1;

        return x * callPower(x, n -1);
    }
}


