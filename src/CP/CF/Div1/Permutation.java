package CP.CF.Div1;

import java.util.Scanner;

public class Permutation {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-->0) {
            int n = scanner.nextInt();

            int arr[] = new int[n];

            if (n % 2 == 0) {

                for (int i = 0, j = n; i < n; i++, j--) {
                    arr[i] = j;
                }
            }else {

                int divisionPoint = n/2;

                for (int i = 0, j = n; i < divisionPoint; i++, j--) {
                    arr[i] = j;
                }

                for (int i = divisionPoint, j = 1; i < n - 1; i++, j++) {
                    arr[i] = j;
                }

                arr[n-1] = divisionPoint + 1;

            }


            for (int data : arr) System.out.print(data + " ");

            System.out.println();
        }
    }
}
