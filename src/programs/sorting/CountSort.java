package programs.sorting;

import java.io.*;
import java.util.*;

public class CountSort {

    public static void countSort(int[] arr, int min, int max) {
        //write your code here
        int range = max - min + 1;
        int farr[] = new int[range];

        // System.out.println(range);

        for (int i = 0; i < arr.length; i++) {
            int idx = arr[i] - min;
            farr[idx]++;
        }

        //prefix sum
        for (int i = 1; i < range; i++) {
            farr[i] += farr[i - 1];
        }

        //for index substract 1
        for (int i = 0; i < range; i++) {
            farr[i]--;
        }

        int[] ans = new int[arr.length];

        //traverse array in reverse order
        for (int i = arr.length - 1; i >= 0; i--) {

            int val = arr[i];
            int idx = farr[val - min]--;
            ///  System.out.println(idx + " i" + i);
            ans[idx] = val;

        }

        print(ans);

    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        countSort(arr, min, max);
        // print(arr);
    }

}