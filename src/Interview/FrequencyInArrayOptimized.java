package Interview;

import java.util.Scanner;

public class FrequencyInArrayOptimized {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            int length = scanner.nextInt();
            int a[] = new int[length];

            for (int i = 0; i < length; i++)
                a[i] = scanner.nextInt();

            for (int i = 0; i < length; i++) {
                a[i] = a[i] - 1;
            }

            for (int i = 0; i < length; i++) {
                a[a[i] % length] = a[a[i] % length] + length;

            }

            for (int i = 0; i < length; i++) {
                System.out.print(a[i]/length  + " ");
            }
           System.out.println();
        }

    }
}
