package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class RearangeArrayIndexBoth {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[]arr = new int[n];
        int[] index = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            index[i] = scanner.nextInt();
        }

        int temp;
        for (int i = 0, j = 0; i < n/ 2; i++) {
             temp = arr[i];
             arr[i] = arr[index[i]];
             arr[index[i]] = temp;

        }

        for (int element : arr) System.out.print(element + " ");
    }
}
