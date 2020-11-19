package CP.CF.Div;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class TwoBrackets {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();
        scanner.nextLine();
        while (test-->0) {

            String s =  scanner.nextLine();
            Stack<Character> paran = new Stack<>();
           Stack<Character> square = new Stack<>();
            int erase = 0;
            for (int i = 0; i < s.length(); i++) {

                char ch = s.charAt(i);

                if(ch == '(') {
                   paran.push(ch);
                }else if(ch == '[') {
                    square.push(ch);
                }else if(ch == ')' && paran.size() > 0) {
                    paran.pop();
                    erase++;
                }else if(ch == ']' && square.size() > 0) {
                    square.pop();
                    erase++;
                }

            }

            System.out.println(erase);

        }
   }
}
