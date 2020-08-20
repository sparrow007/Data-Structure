package programs.Recursions;

import java.util.Scanner;

public class PrintKPC {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        printKPC(input, "");

    }
     static final String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};
    static void printKPC(String input, String ans) {

     if(input.length() <= 0) {
         System.out.print(ans + " ");
         return;
     }

     char position = input.charAt(0);
     String code = codes[Character.getNumericValue(position)];

     for(int i = 0; i < code.length(); i++) {
         printKPC(input.substring(1), ans + code.charAt(i));
     }

    }
}
