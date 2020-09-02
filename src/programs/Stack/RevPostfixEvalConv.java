package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevPostfixEvalConv {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String postfixExp = scanner.nextLine();

        Stack<String> infixExp = new Stack<>();
        Stack<String> preExp = new Stack<>();
        Stack<Integer> evaluation = new Stack<>();

        for (int i = 0; i < postfixExp.length(); i++) {

             char ch = postfixExp.charAt(i);

             if(Character.isDigit(ch)) {
                 infixExp.push(Character.toString(ch));
                 preExp.push(Character.toString(ch));
                 evaluation.push(Character.getNumericValue(ch));

             }else {

                String infixExpValue2 = infixExp.pop();
                String infixExpValue1 = infixExp.pop();

                String preExpValue2 = preExp.pop();
                String preExpValue1 = preExp.pop();

                int val2 = evaluation.pop();
                int val1 = evaluation.pop();

                String infixExperession = "(" + infixExpValue1 + ch + infixExpValue2 + ")";
                String prefixExpression = ch + preExpValue1 + preExpValue2;

                int data = operation(val1, val2, ch);

                infixExp.push(infixExperession);
                preExp.push(prefixExpression);
                evaluation.push(data);

             }
        }

        System.out.println(evaluation.peek());
        System.out.println(infixExp.peek());
        System.out.println(preExp.peek());

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
