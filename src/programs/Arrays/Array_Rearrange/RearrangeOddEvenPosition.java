package programs.Arrays.Array_Rearrange;

import java.util.Arrays;
import java.util.Scanner;

public class RearrangeOddEvenPosition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        rearrangeOddEven(arr);

        for (int element : arr) System.out.print(element + " ");
    }

    private static void rearrangeOddEven(int[] arr) {

        int array_length = arr.length;
        int[] temp = new int[array_length];
        //Make an auxilary copy of original array
        for (int i = 0; i < array_length; i++) {
            temp[i] = arr[i];
        }

        //sort the array (temp)
        Arrays.sort(temp);

        int even = array_length / 2;
        int odd = array_length - even;

        //because the array is started from zero so odd will
        int j = odd - 1;

        for (int i = 0; i < array_length; i += 2) {
            arr[i] = temp[j];
            j--;
        }

         j = odd;

        for (int i = 1; i < array_length; i += 2) {
            arr[i] = temp[j];
            j++;
        }
    }
}
