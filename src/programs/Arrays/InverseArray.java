package programs.Arrays;

import java.util.Scanner;

public class InverseArray {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];

        for(int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        for(int i = 0; i < n; i++) {
            b[a[i]] = i;
        }

        for(int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
