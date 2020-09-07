package programs.Arrays;

import java.util.Scanner;

public class SumOfArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int firstSize = scanner.nextInt();
        int[] arr1 = new int[firstSize];

        for (int i = 0; i < firstSize; i++) {
            arr1[i] = scanner.nextInt();
        }

        int secondSize = scanner.nextInt();
        int arr2[] = new int[secondSize];

        for (int i = 0; i < secondSize; i++)
            arr2[i] = scanner.nextInt();

        int finalSize = Math.max(firstSize, secondSize) + 1;
        int[] out = new int[finalSize];

        int carry = 0;
        int first = firstSize - 1;
        int second = secondSize - 1;

        for (int i = finalSize-1; i >= 0; i--, first--, second--) {

            int ans = (first >= 0 ? arr1[first] : 0) + (second >= 0 ? arr2[second] : 0) + carry;
            if(ans >= 10) {
                ans = ans % 10;
                carry = 1;
            }else {
                carry = 0;
            }
            out[i] = ans;

        }

        for (int i = 0; i < finalSize; i++) {
            System.out.print(out[i] + " ");
        }

    }

    public static void num(int[] arr1, int arr2[], int out[]) {
        int carry = 0;
        int first = arr1.length - 1;
        int second = arr2.length - 1;

        for (int i = out.length-1; i >= 0; i--, first--, second--) {

            int ans = (first >= 0 ? arr1[first] : 0) + (second >= 0 ? arr2[second] : 0) + carry;
            if(ans >= 10) {
                ans = ans % 10;
                carry = 1;
            }else
                carry = 0;

            out[i] = ans;

        }

    }

}
