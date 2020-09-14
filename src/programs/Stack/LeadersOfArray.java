package programs.Stack;

import java.util.*;

public class LeadersOfArray {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test-->0) {

            int length = scanner.nextInt();
            int[]arr = new int[length];

            for (int i = 0; i < length; i++) arr[i] = scanner.nextInt();

            int max = arr[length-1];

            for (int i = length - 2; i >= 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                }else {
                    arr[i] = -1;
                }
            }

            for (int i : arr) {
                if (i != -1)
                    System.out.print(i + " ");
            }


            System.out.println();

        }



    }
}
