package LeetCode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BackSpaceStringCompare {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String t = scanner.nextLine();

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != '#') {
                st1.push(ch);
            }else {
                st1.pop();
            }
        }

        for (int i = 0; i < t.length(); i++) {
            char ch = t.charAt(i);
            if (ch != '#') {
                st2.push(ch);
            }else {
                st2.pop();
            }
        }

        if (st1.size() == 0 && st2.size() == 0) {
            System.out.println(true);

        }else if (st1.size() == st2.size()) {

            while (st1.size() > 0) {

                char first = st1.pop();
                char second = st2.pop();

                if (first != second) {
                    System.out.println(false);
                    return;
                }

            }

            System.out.println(true);

        }else {
            System.out.println(false);
        }

    }

    public boolean backspaceCompare(String S, String T) {

        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for (int i = 0; i < S.length(); i++) {
            char ch = S.charAt(i);
            if (ch != '#') {
                st1.push(ch);
            }else {
                st1.pop();
            }
        }

        for (int i = 0; i < T.length(); i++) {
            char ch = T.charAt(i);
            if (ch != '#') {
                st2.push(ch);
            }else {
                st2.pop();
            }
        }

        if (st1.size() == 0 && st2.size() == 0) {
            return true;

        }else if (st1.size() == st2.size()) {

            while (st1.size() > 0) {

                char first = st1.pop();
                char second = st2.pop();

                if (first != second) {
                    return false;
                }

            }

            return true;

        }else {
            return false;
        }

    }
}
