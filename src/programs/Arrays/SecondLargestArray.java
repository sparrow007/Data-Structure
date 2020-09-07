package programs.Arrays;

import java.util.Scanner;

public class SecondLargestArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = scanner.nextInt();

        int min = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }

        int min2 = Integer.MIN_VALUE;
        for (int i = 0; i < length; i++) {
            if(arr[i] < min && arr[i] > min2) {
                min2 = arr[i];
            }
        }

        System.out.print(min + " " + min2);

    }


    public static int secondLargestElement(int[] arr) {
        //Your code goes here
        int min = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > min) {
                min = arr[i];
            }
        }

        int min2 = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min && arr[i] > min2) {
                min2 = arr[i];
            }
        }
        return min2;
    }

}
