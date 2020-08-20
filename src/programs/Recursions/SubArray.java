package programs.Recursions;

import java.util.Scanner;

public class SubArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] a = new int[n];
//
//        for(int i = 0; i < n; i++)
//            a[i] = scanner.nextInt();

        int []a = {1, 2, 3};

        printSubArray(a, 0, 0);

    }

    public static void printSubArray(int[] a, int start, int end) {

        if(end == a.length) return;


        else if(start > end)
            printSubArray(a, 0, end + 1);

        else {
            System.out.print("[");

            for (int i = start; i < end; i++)
                System.out.print(a[i] + "");

            System.out.println(a[end] + "]");
            printSubArray(a, start + 1, end);
        }


    }
}
