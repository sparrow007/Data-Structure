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

        reorderArray(arr, index, n);

        for (int element : arr) System.out.print(element + " ");

        System.out.println();

        for (int element : index) System.out.print(element + " ");
    }

    static void reorderArray(int[] arr, int[] index, int n) {

        for (int i = 0; i < n; i++) {
            while (index[i] != i) {

                //Store the target values
                int oldTargetI = index[index[i]];
                int oldTargetV = arr[index[i]];

                //Place current value of a[i] at provided index array
                //or at the right position
                arr[index[i]] = arr[i];
                index[index[i]] = index[i];

                //Now placec the target values in current position in both array

                arr[i] = oldTargetV;
                index[i] = oldTargetI;

            }
        }

    }
}
