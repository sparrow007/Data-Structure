package programs.Arrays.Array_Rotations;

import java.util.Scanner;

public class ArrayRotationHaming {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];
        int temp[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        for(int i = 0; i < n; i++) temp[i] = arr[i];

        int maxHam = 0;

        for (int i = 1; i < n; i++) {
            rotateArray(temp);
            //for (int data : temp) System.out.print(data + " ");

            //System.out.println();
            int currHam = 0;
            for (int j = 0; j < n; j++) {
                if(arr[j] != temp[j]) currHam++;
            }

            maxHam = Math.max(currHam, maxHam);

        }

        System.out.println(maxHam);
    }

    static void rotateArray(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++)
            arr[i] = arr[i + 1];

        arr[arr.length-1] = temp;
    }
}
