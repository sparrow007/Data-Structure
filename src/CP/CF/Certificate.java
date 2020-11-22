package CP.CF;

import java.util.Scanner;

public class Certificate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input_n = scanner.nextInt();

        int input_m = scanner.nextInt();

        int input_k = scanner.nextInt();

        final int givenQuestion = 10;

        int provideCertificate = 0;

        while (input_n-->0) {

            int[] array = new int[input_k];
            int q;

            for (int i = 0; i < input_k; i++) {
                array[i] = scanner.nextInt();
            }

            q = scanner.nextInt();

            int total_sum = 0;

            for (int i = 0; i < input_k ; i++) {
                total_sum += array[i];
            }

            if(total_sum >= input_m &&  q <= givenQuestion)
                provideCertificate++;

        }

        System.out.println(provideCertificate);
    }
}
