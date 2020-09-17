package programs.StringProblem;

import java.util.Scanner;

public class String {

    public static void main(java.lang.String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] arr = new int[length];

        for (int i = 0; i < length; i++) arr[i] = scanner.nextInt();

        int[] b = replaceElements(arr);
        for (int i = 0; i < length; i++) System.out.println(b[i]);
    }

    public static int[] replaceElements(int[] arr) {

        int max = arr[arr.length-1];
        arr[arr.length-1] = -1;

        for (int start_index = arr.length-2; start_index >= 0; start_index--) {

            if (arr[start_index] >= max) {
                int temp = arr[start_index];
                arr[start_index] = max;
                max = temp;
            }

        }
        return arr;
    }
}
