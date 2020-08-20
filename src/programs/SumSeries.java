package programs;

import java.util.Scanner;

public class SumSeries {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a = ");
        int a = scanner.nextInt();

        float result = 0;
        for (float i = 1; i <= a; i++) {
            if(i % 2 == 0 ) {
                result -= 1 / i;
            }else result += 1/i;
        }

        System.out.println(result);

    }
}
