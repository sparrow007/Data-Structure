package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class ValidString {


    // method to get length of the longest valid
    static int findMaxLen(String str)
    {
        int n = str.length();

        // Create a stack and push -1 as initial index to it.
        Stack<Integer> stk = new Stack<>();
        stk.push(-1);

        // Initialize result
        int result = 0;

        // Traverse all characters of given string
        for (int i=0; i<n; i++)
        {
            // If opening bracket, push index of it
            if (str.charAt(i) == '(')
                stk.push(i);

            else // If closing bracket, i.e.,str[i] = ')'
            {
                // Pop the previous opening bracket's index
                stk.pop();

                // Check if this length formed with base of
                // current valid substring is more than max
                // so far
                if (!stk.empty())
                    result = Math.max(result, i - stk.peek());

                    // If stack is empty. push current index as
                    // base for next valid substring (if any)
                else stk.push(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        scanner.nextLine();

        while (test-->0) {

            String string = scanner.nextLine();

//            Stack<Character> st = new Stack<>();
//
//            int length = 0;
//
//            int lastLength = 0;
//
//            long maxOpenValue = string.chars().filter(c -> c == '(').count();
//            long maxCloseValue = string.length() - maxOpenValue -1;
//
//            System.out.println(maxCloseValue);
//            System.out.println(maxOpenValue);
//
//                for (int i = 0; i < string.length(); i++) {
//
//                    char ch = string.charAt(i);
//
//                    if (ch == '(') {
//                        st.push(ch);
//                    } else {
//
//                        if (st.size() > 0) {
//                            length += 2;
//                            st.pop();
//                        } else {
//                            lastLength = Math.max(length, lastLength);
//                            length = 0;
//                        }
//
//                    }
//
//                }

            System.out.println(findMaxLen(string));


        }


    }

}
