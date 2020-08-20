package programs.Recursions.GFG;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAddition {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while(test > 0) {

            int n = scanner.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++)
                a[i] = scanner.nextInt();

            print(a, 0, n-1, 0);

            test--;

        }
    }

    public static void print(int[] a, int l, int r, int sum) {

        if(l > r) {
            System.out.print(sum + " ");
            return;
        }

        print(a, l+1, r, sum + a[l]);
        print(a, l+1, r, sum);
    }
}
