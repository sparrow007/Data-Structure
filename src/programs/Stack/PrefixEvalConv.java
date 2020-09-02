package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class PrefixEvalConv {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String prefixExp = scanner.nextLine();

        Stack<String> infixExp = new Stack<>();
        Stack<String> postfixExp = new Stack<>();
        Stack<Integer> evaluation = new Stack<>();

        for (int i = prefixExp.length() - 1; i >= 0; i--) {

            char ch = prefixExp.charAt(i);

            if(Character.isDigit(ch)) {
                infixExp.push(Character.toString(ch));
                postfixExp.push(Character.toString(ch));
                evaluation.push(ch - '0');

            }else {

                String infixValue1 = infixExp.pop();
                String infixValue2 = infixExp.pop();

                String postfixValue1 = postfixExp.pop();
                String postfixValue2 = postfixExp.pop();

                int val1 = evaluation.pop();
                int val2 = evaluation.pop();
                int ans = operation(val1, val2, ch);

                String infixExpression = "(" + infixValue1 + ch + infixValue2 + ")";
                String postfixExpression = postfixValue1 + postfixValue2 + ch;

                evaluation.push(ans);
                infixExp.push(infixExpression);
                postfixExp.push(postfixExpression);

            }

        }

        System.out.println(evaluation.peek());
        System.out.println(infixExp.peek());
        System.out.println(postfixExp.peek());


    }

    static int operation(int v1, int v2, char operator) {
        if(operator == '+') {
            return v1 + v2;

        }else if(operator == '-') {
            return v1-v2;

        } else if(operator == '*') {
            return v1*v2;

        }else {
            return v1 / v2;
        }

    }
}
