package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevInfixEvaluation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String expression = scanner.nextLine();

        Stack<Integer> operandsStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            if(ch == ' ')
                continue;

            if(ch == '(') {
                operatorStack.push(ch);
            }else if(ch == ')') {

                while (operatorStack.peek() != '(') {

                    int v2 = operandsStack.pop();
                    int v1 = operandsStack.pop();

                    int ans = operation(v1, v2,operatorStack.pop());
                    operandsStack.push(ans);
                }
                operatorStack.pop();


            }else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                if(operatorStack.size() > 0 && operatorStack.peek() != '(' && precedence(ch) <= precedence(operatorStack.peek())) {

                    int v2 = operandsStack.pop();
                    int v1 = operandsStack.pop();

                    int ans = operation(v1, v2,operatorStack.pop());
                    operandsStack.push(ans);

                }

                operatorStack.push(ch);

            }else {
              operandsStack.push(Character.getNumericValue(ch));
            }


        }


        int operatorStackSize = operatorStack.size();
        while (operatorStackSize > 0) {

            int v2 = operandsStack.pop();
            int v1 = operandsStack.pop();

            int ans = operation(v1, v2,operatorStack.pop());
            operandsStack.push(ans);

            operatorStackSize--;
        }

        System.out.println(operandsStack.peek());

    }

    public static int precedence(char operator) {
        if(operator == '+' || operator == '-')
            return 1;
        else
            return 2;
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
