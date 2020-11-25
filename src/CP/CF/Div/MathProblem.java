package CP.CF.Div;

import java.util.Arrays;
import java.util.Scanner;

public class MathProblem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();

        Arrays.sort(arr);

        long number = arr[n/2];

        long sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.abs(number - arr[i]);
        }

        System.out.println(sum);


    }
}