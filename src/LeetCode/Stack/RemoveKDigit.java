package LeetCode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class RemoveKDigit {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        scanner.nextLine();
        String num = scanner.nextLine();

        if (k == num.length()) return;

        Stack<Character> numberStack = new Stack<>();
        int i = 0;
        for (char ch : num.toCharArray()) {

            if (!numberStack.isEmpty() && ch < numberStack.peek()) {

                while (numberStack.size() > 0 && ch < numberStack.peek() && k > 0) {
                    k--;
                    numberStack.pop();
                }
            }
            numberStack.push(ch);

        }

        while (k > 0) {
            numberStack.pop();
            k--;
        }

        StringBuilder stringBuilder = new StringBuilder();

        while (numberStack.size() > 0) {
            stringBuilder.append(numberStack.pop());
        }

        stringBuilder.reverse();

        while (stringBuilder.length() > 1 && stringBuilder.charAt(0) == '0') {
            stringBuilder.deleteCharAt(0);
        }
        System.out.println(stringBuilder.toString());

    }

}
