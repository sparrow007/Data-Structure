package Interview;

import sun.rmi.runtime.Log;

import java.util.Scanner;

public class FrequencyInArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test--> 0) {
            int length = scanner.nextInt();
            int a[] = new int[length];

            for (int i = 0; i < length; i++)
                a[i] = scanner.nextInt();

            int i = 0;

            while (i < length) {

                if (a[i] <= 0) {
                    i++;
                    continue;
                }

                int elementIndex = a[i] - 1;


                if (a[elementIndex] > 0) {
                    a[i] = a[elementIndex];
                    a[elementIndex] = -1;

                }else {
                    a[elementIndex] += -1;
                    a[i] = 0;
                }

            }

            for (i = 0; i < length; i++) {
                System.out.print(Math.abs(a[i]) + " ");
            }


        }
    }

}
