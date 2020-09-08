package programs.Arrays;

import java.util.Scanner;

public class PairSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = scanner.nextInt();

        int count = 0;
        for (int i = 0; i < length; i++) {
            for (int j = i+1; j < length; j++) {
               for (int k = j + 1; k < length; k++) {
                   if (arr[i] + arr[j] + arr[k] == 12)
                       count++;
               }
            }
        }

        System.out.println(count);
    }

    public static int pair(int arr[], int x) {

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    if (arr[i] + arr[j] + arr[k] == 12)
                        count++;
                }
            }
        }

        return count;

    }
}
