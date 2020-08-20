package programs.Arrays;

import java.util.Scanner;

public class OptArrayAdd {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int m = scanner.nextInt();
        int b[] = new int[m];

        for(int i = 0; i < m; i++)
            b[i] = scanner.nextInt();

        int sum[] = new int[Math.max(n,m)];
        int c = 0;
        int i = n-1;
        int j = m -1;
        int k = sum.length - 1;

        while(k >= 0) {
            int d = c;

            if(i >= 0)
                d += a[i];

            if(j >= 0)
                d += b[j];

            sum[k] = d % 10;
            c = d / 10;

            i--;
            j--;
            k--;
        }

        if(c != 0)
            System.out.println(c);

        for(int val : sum) {
            System.out.println(val);
        }
    }
}
