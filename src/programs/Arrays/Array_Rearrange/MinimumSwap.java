package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class MinimumSwap {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test--> 0) {

            int n = scanner.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int k  = scanner.nextInt();


            int count = 0;
            int startIndex = -1;

            for (int i = 0; i < n; i++) {
               if(startIndex < 0) {
                   if(arr[i] >= k) {
                       startIndex = i;
                       i--;
                   }
               }else {
                   if(arr[i] <= k) count++;
               }
            }
            System.out.println(count);
        }
    }
}
