package programs.Arrays;

import java.util.Scanner;

public class SubSetArray {

    public static void main(String ars[]) {

        Scanner scanner = new Scanner(System.in);
        int binary[] = new int[8];
        int number = scanner.nextInt();
//        int a[] = new int[n];
//
//        for(int i = 0; i < n; i++) {
//            a[i] = scanner.nextInt();
//        }



        int i = binary.length-1;
        while (number > 0) {
            int reminder = number%2;
            binary[i] = reminder;
            number = number/2;
            System.out.println(number);
            i--;

        }

        for(int j = 0; j < binary.length; j++){}
          //  System.out.print(binary[j] + " ");
        //


    }
}