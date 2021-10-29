package programs.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class RotationNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int length = (int) (Math.log10(n) + 1);
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.remove()

        k = k % length;

        if (k < 0) {
            k = k + length;
        }

//        System.out.println(k);
//
//        if (k > 0) {
//            int div = (int) (Math.pow(10, k) * 1);
//            int r = n % div;
//            n = n / div;
//            n = (int) (Math.pow(10, length - k) * r) + n;
//        } else {
//            k = Math.abs(k);
//            int div = (int) (Math.pow(10, length - k) * 1);
//            int f = n / div;
//            n = n % div;
//            n = (int) ((Math.pow(10, k) * n) + f);
//        }
        System.out.println(n);
    }
}
