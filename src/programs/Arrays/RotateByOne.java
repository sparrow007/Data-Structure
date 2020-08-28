package programs.Arrays;


import java.util.*;

public class RotateByOne {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test > 0) {

            int n = scanner.nextInt();
            int[] a = new int[n];

            for(int i = 0; i < n; i++)
                a[i] = scanner.nextInt();

            int temp = a[a.length-1];

            for(int i = a.length-2; i >= 0; i--) {
                a[i + 1] = a[i];
            }

            a[0] = temp;

            for(int i = 0; i < n; i++)
                System.out.print(a[i] + " ");


            System.out.println();
            test--;
        }
    }
}
