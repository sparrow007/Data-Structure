package programs.Arrays;

import java.util.Scanner;

public class ArrayAdd {

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int a[] = new int[n];

        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int m = scanner.nextInt();
        int b[] = new int[m];

        for(int i = 0; i < m; i++)
            b[i] = scanner.nextInt();

        int finalLength = Math.max(n,m);
        int c[] = new int[finalLength];

        int carry = 0;
        for(int i = n-1, j = m-1, k = c.length-1; i >= 0 || j >= 0 && k >= 0; i--, j--, k--) {
                if(j < 0)
                    c[k] = a[i] + carry;
                else if(i <0)
                    c[k] = b[j] + carry;
                else {
                    int sum = a[i] + b[j] + carry;
                    c[k] = sum%10;
                    carry = sum/10;

                }
        }

        for(int i = 0; i < finalLength; i++)
            System.out.print(c[i] + " ");
    }
}
