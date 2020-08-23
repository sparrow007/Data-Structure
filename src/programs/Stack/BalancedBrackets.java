package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> st = new Stack();

        for(int i = 0; i < input.length(); i++) {

            char ch = input.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {

                st.push(ch);

            } else if(ch == ')') {

                if(!handleClosing(st, '(')) return;

            } else if( ch == ']') {

                if(!handleClosing(st, '[')) return;

            }else if( ch == '}') {

                if(!handleClosing(st, '{')) return;
            }
        }

        System.out.println(st.size() == 0);

    }

    static boolean handleClosing (Stack<Character> st, char ch) {

        if(st.size() == 0 ) {
            System.out.println(false);
            return false;
        }
        else if(st.peek() != ch ) {
            System.out.println(false);
            return false;
        }else {
            st.pop();
            return true;
        }
    }
}
