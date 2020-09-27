package programs.Extraa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GCDNumber {

    static int GCD(int a, int b) {
        System.out.println(a + " " + b);
        return a == 0 ? b : GCD(b%a, a);
    }

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

//        double a = 51/4.0;
//
//        double b = Math.max(Double.MIN_VALUE,-1.0);
//
//        System.out.println(b);

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] a = new int[length];

        for (int i = 0; i < length; i++) {
            a[i] = scanner.nextInt();
        }

        prefixesDivBy5(a);


        System.out.println(getNumber("011"));

    }

    public static List<Boolean> prefixesDivBy5(int[] a) {

        List<Boolean> ans = new ArrayList<>();

        int i = 0;
        int j = 0;

        String binary = "";

        while (j < a.length) {

            binary += String.valueOf(a[j]);
            int num = getNumber(binary);

            boolean out = num % 5 == 0;

            System.out.print(num + " ");

            ans.add(out);

            j++;

        }

        System.out.println();


        return ans;

    }



    public static int getNumber(String binary) {

        int number = 0;

        int power = 0;

        for (int powerIndex = binary.length()-1; powerIndex >= 0; powerIndex--, power++) {

            int binaryNumber = Character.getNumericValue(binary.charAt(powerIndex));

            if(binaryNumber != 0)
                number += Math.pow(2, power);

        }

        return number;

    }
}
