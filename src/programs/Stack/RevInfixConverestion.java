package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RevInfixConverestion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String exp = scanner.nextLine();

        Stack<String> prefixExp = new Stack<>();
        Stack<String> postfixExp = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            if( ch == ' ')
                continue;

            if (ch == '(') {
                operator.push(ch);
            }else if( ch == ')') {
                while (operator.peek() != '(') {

                    String preV2 = prefixExp.pop();
                    String preV1 = prefixExp.pop();

                    String postV2 = postfixExp.pop();
                    String postV1 = postfixExp.pop();

                    char opValue = operator.pop();

                    String prefixExperssion =  opValue + preV1 + preV2;
                    prefixExp.push(prefixExperssion);

                    String postfixExpression = postV1 + postV2 + opValue;
                    postfixExp.push(postfixExpression);

                }
                operator.pop();
            } else if(ch == '+' || ch == '-' || ch == '*' || ch == '/') {

                while (operator.size() > 0 && operator.peek() != '(' && precendence(ch) <= precendence(operator.peek())) {
                    String preV2 = prefixExp.pop();
                    String preV1 = prefixExp.pop();

                    String postV2 = postfixExp.pop();
                    String postV1 = postfixExp.pop();

                    char opValue = operator.pop();

                    String prefixExperssion =  opValue + preV1 + preV2;
                    prefixExp.push(prefixExperssion);

                    String postfixExpression = postV1 + postV2 + opValue;
                    postfixExp.push(postfixExpression);
                }

                operator.push(ch);

            }else {
                postfixExp.push(Character.toString(ch));
                prefixExp.push(Character.toString(ch));
            }

        }

        while (operator.size() > 0) {
            String preV2 = prefixExp.pop();
            String preV1 = prefixExp.pop();

            String postV2 = postfixExp.pop();
            String postV1 = postfixExp.pop();

            char opValue = operator.pop();

            String prefixExperssion =  opValue + preV1 + preV2;
            prefixExp.push(prefixExperssion);

            String postfixExpression = postV1 + postV2 + opValue;
            postfixExp.push(postfixExpression);
        }

        System.out.println(postfixExp.peek());
        System.out.println(prefixExp.peek());

    }

    public static int precendence(char oprator) {
        if(oprator == '+' || oprator == '-')
            return 1;
        else
            return 2;
    }
}
