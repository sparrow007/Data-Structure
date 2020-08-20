package programs.Recursions;

import java.util.Scanner;

public class ArrayReverse {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int arr[] = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        displayArrReverse(arr, n-1);
    }

    public static void displayArrReverse(int[] arr, int idx) {

        if(idx < 0)
            return;

        System.out.println(arr[idx]);
        displayArrReverse(arr, idx-1);


    }

}
