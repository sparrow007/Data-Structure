package HackerEarth;

import java.util.Scanner;

public class WeightDivide {


    static int count = 0;

    static void calculate(int a[], int k) {
        if(k < 0) return;

        for (int i = 0; i < a.length; i++) {
            int sum = a[i];
            if(sum == k) count++;

            for (int j = i+1; j < a.length; j++) {
                sum = a[i] + a[j];
                if(sum == k) count++;
            }
        }

        if(count == 0) calculate(a, k-1);
        else System.out.println(count);


    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] a = new int[length];
        for (int i = 0; i < length; i++) a[i] = scanner.nextInt();

        int k = scanner.nextInt();

        calculate(a, k);



        //System.out.println(count);
    }
}
