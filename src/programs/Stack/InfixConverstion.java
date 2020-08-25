package programs.Stack;

import java.io.*;
import java.util.*;

public class InfixConverstion {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();

        Stack<String> prefix = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<Character> operator = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {

            char val = exp.charAt(i);


            if(val == ' ')
                continue;

            if(val == '(') {
                operator.push(val);

            }else if(Character.isLetter(val)) {

                prefix.push(Character.toString(val));
                postfix.push(Character.toString(val));

            }else if(val == ')') {

                while(operator.peek() != '(') {
                    char opr = operator.pop();

                    // Prefix data
                    String prefix2 = prefix.pop();
                    String prefix1 = prefix.pop();
                    String newPrefix = opr + prefix1 + prefix2;
                    prefix.push(newPrefix);

                    //Postfix element
                    String postfix2 = postfix.pop();
                    String postfix1 = postfix.pop();
                    String newPostfix = postfix1 + postfix2 + opr;
                    postfix.push(newPostfix);
                }
                operator.pop();

            }else {
                while (operator.size() > 0 && operator.peek() != '(' && precedence(val) <= precedence(operator.peek())) {
                    char opr = operator.pop();

                    // Prefix data
                    String prefix2 = prefix.pop();
                    String prefix1 = prefix.pop();
                    String newPrefix = opr + prefix1 + prefix2;
                    prefix.push(newPrefix);

                    //Postfix element
                    String postfix2 = postfix.pop();
                    String postfix1 = postfix.pop();
                    String newPostfix = postfix1 + postfix2 + opr;
                    postfix.push(newPostfix);
                }
                operator.push(val);

            }
        }

        while (operator.size() > 0) {
            char opr = operator.pop();

            // Prefix data
            String prefix2 = prefix.pop();
            String prefix1 = prefix.pop();
            String newPrefix = opr + prefix1 + prefix2;
            prefix.push(newPrefix);

            //Postfix element
            String postfix2 = postfix.pop();
            String postfix1 = postfix.pop();
            String newPostfix = postfix1 + postfix2 + opr;
            postfix.push(newPostfix);

        }

        System.out.println(postfix.peek());
        System.out.println(prefix.peek());

    }

    public static int precedence(char op) {
        if(op == '+' || op == '-')
            return 1;
        else
            return 2;
    }

}
