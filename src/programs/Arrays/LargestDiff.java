package programs.Arrays;

import java.util.Scanner;

public class LargestDiff {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test-->0) {

            int length = scanner.nextInt();
            int[] arr = new int[length];

            for (int i = 0; i < length; i++) arr[i] = scanner.nextInt();

            int min = Integer.MIN_VALUE;

            for (int i = 0; i < length; i++) {
                for (int j = i+1; j < length; j++) {
                    int a = arr[j];
                    int b = arr[i];

                    int c = a - b;

                    min = Math.max(c, min);

                }
            }

            System.out.println(min);

        }

    }
}
