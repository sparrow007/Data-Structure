package programs.Recursions;

import java.util.Scanner;

public class PrintDecre {

    public static void main(String args[]) {
        Scanner scanner=new Scanner(System.in);

        int n = scanner.nextInt();
        printDecreasing(n);

    }

    public static void printDecreasing(int n) {
        if(n == 0) {
            return;
        }
        System.out.println(n);
        printDecreasing(n-1);
        System.out.println(n);

    }
}
