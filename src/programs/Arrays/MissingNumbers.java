package programs.Arrays;

import java.io.*;
import java.util.*;

public class MissingNumbers {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test > 0) {

            int n = scanner.nextInt();
            int[] arr = new int[n];

            arr[n-1] = Integer.MAX_VALUE;

            for(int i = 0; i < n-1; i++)
                arr[i] = scanner.nextInt();


            Arrays.sort(arr);

            boolean sol = false;
            int j = 1;
            for(int i = 0; i < n-1; i++, j++) {
                if(arr[i] != j) {
                    System.out.println(j);
                    sol = true;
                    break;
                }
            }

            if(!sol)
                System.out.println(j);

            test--;
        }

    }
}
