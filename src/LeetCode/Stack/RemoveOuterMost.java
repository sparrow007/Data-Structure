package LeetCode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveOuterMost {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Stack<Integer> st = new Stack<>();
        st.push(-1);

        StringBuilder decompose = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch == ')') {
            }

        }

        System.out.println(decompose.toString());
    }
}
