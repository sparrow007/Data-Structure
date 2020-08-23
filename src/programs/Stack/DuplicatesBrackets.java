package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicatesBrackets {

    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Stack<Character> st = new Stack<>();
        for (int i =0 ; i < input.length(); i++) {
            char ch = input.charAt(i);

            if(ch != ')') {
                st.push(ch);
            }else {
                if(st.peek() == '(') {
                    System.out.println("true");
                    return;
                }
                while(st.peek() != '(') {
                    st.pop();
                }
                st.pop();
            }
        }
        System.out.println("false");

    }
}
