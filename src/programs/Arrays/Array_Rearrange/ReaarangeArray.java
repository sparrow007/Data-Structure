package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class ReaarangeArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

       int[] temp =  reArrange(arr, n);

        for (int element : temp)
        System.out.print(element + " ");

    }

    static int[] reArrange(int[] arr, int n) {
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[arr[i]] = i;
        }
       return temp;
    }

    static void reArrangeArray(int[] arr, int n) {



    }
}
