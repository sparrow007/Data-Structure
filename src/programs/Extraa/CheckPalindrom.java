package programs.Extraa;

import java.util.Scanner;

public class CheckPalindrom {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int temp = a;
        int number = 0;

        while(temp != 0) {
            int n = temp % 10;
            number = number*10 + n;
            temp = temp / 10;
        }

        if(a == number) {
            System.out.println("The number is palindrom");
        }else {
            System.out.println("The number is not palindrom");
        }

    }
}
