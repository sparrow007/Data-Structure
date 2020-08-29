package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevBalanceBrackets {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();


        Stack<Character> expStack = new Stack<>();
        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == '(' || ch == '[' || ch == '{') {
                expStack.push(ch);

            }
            else if (ch == ')') {
                if(expStack.size() > 0 && expStack.peek() == '(') {
                    expStack.pop();
                }
            }
            else if (ch == ']') {
                if(expStack.size() > 0 && expStack.peek() == '[') {
                    expStack.pop();
                }
            }
            else if (ch == '}') {
                if(expStack.size() > 0 && expStack.peek() == '{') {
                    expStack.pop();
                }
            }
        }

        boolean isBalanced = expStack.size() > 0 ? false : true;
        System.out.println(isBalanced);
    }

}
