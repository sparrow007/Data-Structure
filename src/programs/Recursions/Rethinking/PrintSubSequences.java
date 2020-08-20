package programs.Recursions.Rethinking;

import java.util.Scanner;

public class PrintSubSequences {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        printSS(input, "");
    }

    public static void printSS(String str, String ans) {

        if(str.length() == 0){
            System.out.println(ans);
            return;
        }

        char firstChar = str.charAt(0);
        printSS(str.substring(1), ans + firstChar);
        printSS(str.substring(1), ans);


    }
}
