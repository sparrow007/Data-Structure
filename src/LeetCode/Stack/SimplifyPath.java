package LeetCode.Stack;

import java.util.Scanner;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        String unixPath = scanner.nextLine();

        String[] correct = unixPath.split("/");

        for (int i = 0; i < correct.length; i++) {

            System.out.print(correct[i] + " ");

        }
        System.out.println();

        Stack<String> values = new Stack<>();

        int firstPointer = 0;
        int secondPointer = 1;

        for (int i = 0; i < unixPath.length(); i ++) {

            if (secondPointer == unixPath.length() || unixPath.charAt(firstPointer) == unixPath.charAt(secondPointer)) {

                if (secondPointer - firstPointer != 1) {
                    String stackString = unixPath.substring(firstPointer, secondPointer);
                   // System.out.println(stackString);
                    if (stackString.equals("/..")  ) {
                        if (values.size() > 0)
                        values.pop();
                    }else if (!stackString.equals("/.")) {
                        values.push(stackString);
                    }

                }
                    firstPointer = secondPointer;
            }

            secondPointer++;

        }


        String ans = "";
        if (values.size() == 0)  {
            ans = "/";
        }else {
            while (values.size() > 0) {

                ans = values.pop()  + ans;

            }
        }

         System.out.println(ans);

    }
}
