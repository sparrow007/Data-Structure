package CP.atcoder;

import java.util.Scanner;

public class DiceJail {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int number = 0;
        String value = "";

        while (n-->0) {
            int a = scanner.nextInt();
            int b= scanner.nextInt();

            if (a == b) number++;
            else number = 0;

            if(value.equalsIgnoreCase("yes") || number == 3) {
                value = "Yes";
            }else {
                value = "No";
            }


        }

        System.out.println(value);


    }
}