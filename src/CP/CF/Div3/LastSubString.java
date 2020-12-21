package CP.CF.Div3;

import java.util.Scanner;

public class LastSubString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test--> 0) {

            int length = scanner.nextInt();

            for (int i = 1; i < 10; i++) {

                if (i == length) {
                    System.out.println(i);
                    break;
                }

                int sum = i;

                for (int j = i + 1; j < 10; j++) {

                    sum += j;
                    if (sum == length) {
                        System.out.println(sum);
                        sum = -1;
                        break;
                    }
                }

                if(sum == -1) break;
            }
            System.out.println(-1);


        }
    }
}
