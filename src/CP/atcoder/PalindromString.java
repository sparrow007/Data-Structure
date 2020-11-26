package CP.atcoder;

import java.util.Scanner;

public class PalindromString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        int n = input.length();
        String firstString = input.substring(0, ((n-1)/2));
        String secondString  = input.substring(((n + 3) / 2) - 1);

        if (isPalindrom(input) && isPalindrom(firstString) && isPalindrom(secondString)) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }

    static boolean isPalindrom(String s) {
        int start = 0;
        int end = s.length()-1;

        while (start < end) {
            char firstChar = s.charAt(start);
            char secondChar = s.charAt(end);

            if (firstChar != secondChar) return false;

            start++;
            end--;
        }

        return true;
    }

}
