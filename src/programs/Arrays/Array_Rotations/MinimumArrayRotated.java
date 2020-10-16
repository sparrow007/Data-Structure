package programs.Arrays.Array_Rotations;

import java.util.*;
import java.lang.*;
import java.io.*;

public class MinimumArrayRotated {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test--> 0) {

            int length = scanner.nextInt();

            int arr[] = new int[length];

            for (int i = 0; i < length; i++) arr[i] = scanner.nextInt();

            int left = 0;
            int right = length - 1;

            int min = -1;

            while(left < right) {

                int mid = (left + right) / 2;

                if(arr[mid] >arr[mid + 1]) {
                    min = arr[mid + 1];
                    //System.out.println(arr[mid + 1]);
                    break;
                }else if (arr[mid] < arr[mid - 1]) {
                    min = arr[mid];
                    //System.out.println(arr[mid]);
                    break;
                }

                if(arr[left] <= arr[mid]) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }

            }

            if(min == -1)
                System.out.println(arr[0]);
            else
                System.out.println(min);

        }

    }


}
