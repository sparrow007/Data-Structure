package CP.CF;

import java.util.Scanner;

public class SubtractOrDivide {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        while (n-->0) {

            int a = scanner.nextInt();

            int temp = 0;
            if (a > 3) {
                int value = findDivisor(a);
                if (value > -1) {
                    a = value ;
                    temp = 1;
                }
                else {
                    a = findDivisor(a-1);
                    temp = 2;
                }
            }

            if(a == 1)  {
                System.out.println(0 + temp);
            }else if (a == 3) {
                System.out.println(2 + temp);
            }else if (a == 2) {
                System.out.println(1 + temp);
            }

        }

    }

    static int findDivisor (int a) {
        for (int i = 2; i <= 3; i++) {
            if(a % i == 0) return i;
        }

        return  - 1;
    }


}
