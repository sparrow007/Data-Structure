package programs.Stack;

import java.io.*;
import java.util.*;

public class InfixEvaluation {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        // code
        Stack<Integer> oprnd = new Stack<>();
        Stack<Character> oprt = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char ch = exp.charAt(i);

            if(ch == ' ')
                continue;

            if(ch == '(') {
                oprt.push(ch);
            }else if(Character.isDigit(ch)) {
                oprnd.push((ch - '0'));
            }else if (ch == ')') {
                while (oprt.peek() != '(') {
                    int v2 = oprnd.pop();
                    int v1 = oprnd.pop();

                    char operator = oprt.pop();
                    int ans = operation(v1, v2, operator);
                    oprnd.push(ans);
                }
                oprt.pop();
            }
            else{
                while (oprt.size() > 0 && oprt.peek() != '(' && precedence(ch) <= precedence(oprt.peek())) {
                    int v2 = oprnd.pop();
                    int v1 = oprnd.pop();

                    char operator = oprt.pop();
                    int ans = operation(v1, v2, operator);
                    oprnd.push(ans);
                }
                oprt.push(ch);

            }
        }

        while (oprt.size() > 0) {
            int v2 = oprnd.pop();
            int v1 = oprnd.pop();

            char operator = oprt.pop();
            int ans = operation(v1, v2, operator);
            oprnd.push(ans);
        }

        System.out.println(oprnd.peek());

    }

    public static int precedence(char oprator) {
        if(oprator == '+' || oprator == '-')
            return 1;
        else
            return 2;

    }

    public static int operation(int v1, int v2, char operator) {
        if(operator == '+') {
           return v1 + v2;
        }else if(operator == '-') {
            return v1- v2;
        }else if(operator == '*') {
            return v1 * v2;
        }else
            return v1/ v2;

    }
}
