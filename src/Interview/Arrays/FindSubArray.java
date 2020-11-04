package Interview.Arrays;

import java.util.Scanner;

public class FindSubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        int sum = scanner.nextInt();

        twoPointer(arr, n, sum);
    }

    static void showBruteForce(int arr[], int n, int sum) {

        for (int i = 0; i < n; i++) {

            int array_sum = arr[i];

            for (int j = i + 1; j < n; j++) {

                if(array_sum > sum) break;
                else if(array_sum == sum) {
                    System.out.println("found at " + i +" " + (j - 1) + " position");
                    return;
                }

                array_sum += arr[j];
            }
        }

        System.out.println("No Sum found");

    }

    //Next approach is two pointer algorithm

    static void twoPointer(int arr[], int n, int sum) {

        int start = 0;
        int end = 1;

        int array_sum = arr[start];

        while (start < end || end < n) {

            if(array_sum < sum && end < n) {
                array_sum += arr[end];
                end++;
            }else if(array_sum == sum) {
                System.out.println("found at " + start +" " + (end - 1) + " position");
                return;
            }else if(array_sum > sum && start < end) {
                array_sum -= arr[start];
                start++;
            }

        }

        System.out.println((start) +" " + (end) + " array sum = " + array_sum);
        System.out.println("No Sum found");

    }

   static int sumSumArray(int arr[], int n, int sum) {


        int curr_sum = arr[0], start = 0;

        for (int i = 1; i <= n; i++) {

            while (curr_sum > sum && start < i) {
                curr_sum -= arr[start];
                start++;
            }

            if (curr_sum == sum) {
                System.out.println("start = " + start + " i = " + (i-1));
                return i;
            }

            if (i < n)
            curr_sum += arr[i];


        }

        return  -1;

    }

}
