package CP.CF.Div;

import java.util.Scanner;

public class Second {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while(test-->0) {

            int n = scanner.nextInt();

            int arr[] = new int[n];

            for (int i= 0; i < n; i++) arr[i] = scanner.nextInt();


            int high = arr[0];
            int index = 0;
            for (int i = 1 ; i < arr.length; i++ ) {
                if(arr[i] > high) {
                    high = arr[i];
                    index = i;
                }
            }

            int sum = 0;

            for (int i = 0; i < arr.length; i++) {
                if(i != index)
                    sum += arr[i];
            }


            if(sum == 0) {
                System.out.println(high);
            }else {
                System.out.println(sum % high);
            }

        }
    }
}
