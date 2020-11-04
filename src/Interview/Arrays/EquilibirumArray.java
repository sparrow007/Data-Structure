package Interview.Arrays;

import java.util.Scanner;

public class EquilibirumArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        findEfficientEquiliIndex(arr, n);

    }

    static void findEfficientEquiliIndex(int[] arr, int n) {

        int array_sum = 0;

        for (int element : arr) array_sum += element;

        int left_sum = 0;

        for (int i = 0 ; i < n; i++) {

            array_sum = array_sum - arr[i];

            if(array_sum == left_sum) {
                System.out.println("Index is "+ i);
                return;
            }

            left_sum = left_sum + arr[i];



        }

        System.out.println("Not found");

    }

    static void findEquiliIndex(int[] arr, int n) {

        if (n == 1) {
            System.out.println("yes the index is 1");
            return;
        }

        for (int i = 1; i < n; i++) {

            int lowIndexSum = 0;

            for (int j = 0; j < i; j++) {
                lowIndexSum += arr[j];
            }

            int highIndexSum = 0;

            for (int j = i + 1; j < n; j++) {
                highIndexSum += arr[j];
            }

            if(lowIndexSum == highIndexSum) {
                System.out.println("Yes there is a index " + i);
                return;
            }

        }

        System.out.println("No index found");

    }

}
