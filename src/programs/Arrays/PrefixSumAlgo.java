package programs.Arrays;

import java.util.Scanner;

public class PrefixSumAlgo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int arr[] = new int[length];

        for (int start= 0; start < length; start++) arr[start] = scanner.nextInt();

        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int start_index = 0; start_index < length-1; start_index++) {
            arr[start_index + 1] += arr[start_index];
        }

        //To find the index start and end element
        if (start > 0) {
            int sum = arr[end] - arr[start-1];
            System.out.println(sum);

        }else {
            int sum = arr[end];
            System.out.println(sum);
        }
    }
}
