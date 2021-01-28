package programs.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPairArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int arr[] = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = scanner.nextInt();

        int sum = scanner.nextInt();

        Arrays.sort(arr);

        int i = 0;
        int j = arr.length - 1;

        while (i <= j) {

            if (arr[i] + arr[j] == sum) {
                System.out.println(arr[i] + " , " + arr[j]);
                i++;
            }else if(arr[i]+arr[j] < sum) {
                i++;
            }else {
                j--;
            }

        }

    }
}
