package programs.Recursions;

import java.util.Scanner;

public class PrintPermutationEncoding {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String number = scanner.nextLine();
        printEncoding(number, "");

    }

    static void printEncoding(String num , String ans) {
        if(num.length() == 0) {
            System.out.println(ans);
        }else if(num.length() == 1) {
            char ch = num.charAt(0);
            if(ch != '0') {
                char chv = (char) (ch - '0');
                char value = (char)('a' + chv - 1);
                printEncoding(num.substring(1), ans + value);
            }
        }else{
            char first = num.charAt(0);
            if(first == '0'){
               return;
            }else {
                char chv = (char) (first - '0');
                char value = (char)('a' + chv - 1);
                printEncoding(num.substring(1), ans + value);
            }
            String second = num.substring(0,2);
            int chv2 = Integer.parseInt(second);
            if(chv2 <= 26) {
                char value = (char)('a' + chv2 - 1);
                printEncoding(num.substring(2), ans + value);
            }

        }

    }
}
