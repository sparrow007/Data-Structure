package programs.Extraa;

import java.util.Scanner;

public class LoopExp {

    public static void main(String args[]) {

        Scanner scanner  = new Scanner(System.in);
        int a = scanner.nextInt();

        int sum = 0;

        while(a != 0) {
            sum += a % 10;
            a = a/10;
        }

        System.out.println(sum);
    }
}
