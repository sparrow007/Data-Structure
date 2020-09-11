package LeetCode.Stack;

import java.util.Stack;

public class GoodString {


    /*
    *
    * Leetcode the make good string stack
    * Level : Easy
    * */
    public static void main(String[] args) {

        System.out.println(Character.isUpperCase('E'));

    }

    public String makeGood(String s) {

        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (st.size() == 0) {
                st.push(ch);
                continue;
            }

            if (Character.isUpperCase(ch) && Character.toLowerCase(ch) == st.peek() || (Character.isUpperCase(st.peek()) && Character.toLowerCase(st.peek()) == ch)) {
                st.pop();
            }else
                st.push(ch);

        }

        StringBuilder out = new StringBuilder();

        while(st.size() > 0) {

            out.append(st.pop());
        }

        return out.reverse().toString();
    }
}
