package programs.Recursions;

import java.util.Scanner;

public class StringReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        reverse(s, s.length()-1);

    }

    public static void reverse(String s, int length) {
        if(length < 0) return;

        System.out.print(s.charAt(length));
        reverse(s, length-1);
    }

    public static void reverse(String s){
        if((s==null) || (s.length()<=1) ) {
            System.out.println(s);
            return;
        }
        System.out.print(s.charAt(s.length()-1));
        reverse(s.substring(0,s.length()-1));
    }
}
