package CP.atcoder;

import java.util.Scanner;

public class equation {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();


//        int s = 0;
//        for (int i = 1; i <= number; i++) {
//            s += (number-1)/i;
//            System.out.println((number-1)/i);
//        }

        // A * B + C = N

        // C poisitive integer

        // N- 1;

        //A * B < N
        // A *B = N - C

        /**
         * B =  (N - C)/ A
         */

        // A +++ B--- < N

        //1 99
        //2 49
        //2*48 + 4

        int total = 0;
        for (int i = 1 ; i < number; i++)
            for (int j = 1; j < number && i * j < number; j++)
                total++;



        System.out.println(total);

    }
}
