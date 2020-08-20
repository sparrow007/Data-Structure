package programs.Arrays;

import java.util.Scanner;

public class SubArray {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < i; j++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

    }
}
