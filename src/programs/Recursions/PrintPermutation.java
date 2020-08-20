package programs.Recursions;

import java.util.Scanner;

public class PrintPermutation {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printPermutations(input, "");
    }

    public static void printPermutations(String str, String asf) {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return;
        }

        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            printPermutations(str.substring(0, i) + str.substring(i+1), asf+ch);
        }
    }
}
