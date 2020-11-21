package CP.CF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSequence {

    static List<String> al = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();


        while (test-->0) {

            int n = scanner.nextInt();
            int q = scanner.nextInt();

            scanner.nextLine();

            String input = scanner.nextLine();
            findsubsequences(input, "");
            while(q-->0) {

                int l = scanner.nextInt() - 1;
                int r = scanner.nextInt() - 1;

                String required = input.substring(l, r + 1);

               char[] inputChar = input.toCharArray();

               for (int i = 0; i < required.length(); i++) {
                   char ch = required.charAt(i);
                   int j = 0;
                   boolean isFound = false;
                   for (; j < inputChar.length; j++) {

                       if (ch == inputChar[j]) {
                           isFound = true;
                       }
                   }

                   if (!isFound) {
                       System.out.println("NO");
                       break;
                   }
               }

            }

        }

    }


    private static void findsubsequences(String s,
                                         String ans)
    {
        if (s.length() == 0) {
            al.add(ans);
            return;
        }

        // We add adding 1st character in string
        findsubsequences(s.substring(1), ans +
                s.charAt(0));

        // Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not
        findsubsequences(s.substring(1), ans);
    }

}
