package LeetCode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveAllAdjcent {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String update = removeDuplicates(s);
        System.out.println(update);

    }

    public static  String removeDuplicates(String s) {

        Stack<Character> st = new Stack<Character>();
        StringBuilder unique = new StringBuilder();
        for (int i  = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if(st.size() == 0 || st.peek() != ch) {
                st.push(ch);
            }else {
                st.pop();
            }

        }

        System.out.println(st);

        while(st.size() > 0) {

            unique.append(st.pop());

        }

        return unique.reverse().toString();
    }

}
