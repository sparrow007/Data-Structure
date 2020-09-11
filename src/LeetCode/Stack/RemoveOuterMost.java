package LeetCode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveOuterMost {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        Stack<Character> characterStack = new Stack<>();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {

                characterStack.push(s.charAt(i));

                int j = i + 1;

                while (characterStack.size() > 0) {

                    char ch = s.charAt(j);

                    if (ch == '(') characterStack.push(ch);
                    else characterStack.pop();

                    j++;

                }

                stringBuilder.append(s.substring(i+1, --j));
                i = j;

            }

        }

        System.out.println(stringBuilder.toString());

    }
}
