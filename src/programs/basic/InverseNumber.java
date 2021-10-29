package programs.basic;

import java.util.Scanner;

public class InverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

//        int length = (int)Math.log10(n) + 1;
//        int arr[] = new int[length];
//
//        for (int i = 0; i < length; i++) {
//            int num = n % 10;
//            arr[length -num] = i+1;
//            n = n / 10;
//        }
//
//        for (int i : arr)
//            System.out.print(i);
        int out = 0;
        int i = 1;
        int length = (int)Math.log10(n) + 1;
        while (n != 0) {
            int c= n % 10;
            n = n/10;
            c = (int) (Math.pow(10, length - c) * i);
            out += c;
            i++;
        }
        System.out.println(out);
    }
}
