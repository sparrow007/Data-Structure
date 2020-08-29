package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevBlankBrackets {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String exp = scanner.nextLine();

        Stack<Character> bracketsStack = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);
            if(ch == ')') {
                if (bracketsStack.size() > 0 && bracketsStack.peek() == '(') {
                    System.out.println(true);
                    return;
                }else {
                    while (bracketsStack.size() > 0 && bracketsStack.peek() != '(') {
                        bracketsStack.pop();
                    }
                    bracketsStack.pop();

                }
            }else {
                bracketsStack.push(ch);
            }
        }
            System.out.println(false);

    }
}
