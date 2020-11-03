package Interview.Arrays;

import java.util.Scanner;

public class MaxCircularSumSub {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        efficientApproach(arr, n);


    }

    static void oneApproach(int []arr, int n) {

        int maxElement = kadanesAlgo(arr, n);

        int arraySum = 0;

        for (int i = 0; i < n; i++) {

            arraySum += arr[i];

            arr[i] = -arr[i];

        }

        int maxArraySum = arraySum + kadanesAlgo(arr,  n);

        System.out.println(Math.max(maxElement, maxArraySum));

    }

    static int kadanesAlgo(int arr[], int n) {

        int max_so_far = 0;
        int max_element = 0;

        for (int i = 0; i < n; i++) {

            max_so_far += arr[i];
            if(max_so_far > max_element) {
                max_element = max_so_far;
            }

            if(max_so_far < 0) max_so_far = 0;

        }
        return max_element;
    }

    static void maxSum(int arr[], int n) {

        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            int sum = arr[i];
            int j = (i + 1) % n;

            int max_So_far = sum;

           while (j != i) {

               sum += arr[j];

               if(sum > max_So_far) {
                   max_So_far = sum;
               }

               if(sum < 0) {
                   sum = 0;
               }

               j = (j + 1) % n;

           }

           maxSum = Math.max(max_So_far, maxSum);
        }

        System.out.println(maxSum);

    }

    static void efficientApproach(int []arr, int n) {

        int arraySum = 0;

        int curr_sum = arr[0], max_so_far = arr[0], curr_min = arr[0], min_so_far = arr[0];

        for (int i = 0; i < n; i++) {

            arraySum += arr[i];

            max_so_far += arr[i];
            curr_sum = Math.max(max_so_far, curr_sum);
            if(max_so_far < 0) max_so_far = 0;

            min_so_far += arr[i];
            curr_min = Math.min(curr_min, min_so_far);
            min_so_far = Math.min(min_so_far, arr[i]);


        }

        System.out.println("curr_Sum " + curr_sum);
        System.out.println("curr_min " + curr_min);
        System.out.println("array sum " + arraySum);
        System.out.println(Math.max(curr_sum, (arraySum - curr_min)));

    }

}
