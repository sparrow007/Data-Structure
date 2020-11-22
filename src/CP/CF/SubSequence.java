package CP.CF;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();


        while (test-->0) {

            int n = scanner.nextInt();
            int q = scanner.nextInt();

            scanner.nextLine();

            String input = scanner.nextLine();
            while(q-->0) {

                int l = scanner.nextInt() - 1;
                int r = scanner.nextInt() - 1;

                String required = input.substring(l, r + 1);

               char[] inputChar = input.toCharArray();

               boolean isFound = false;

               for (int i = 0; i < l; i++)
                   if (inputChar[i] == inputChar[l]) isFound = true;

               for (int i = r + 1; i < inputChar.length; i++)
                   if (inputChar[i] == inputChar[r]) isFound = true;

                if(isFound) System.out.println("YES");
                else System.out.println("NO");

            }

        }

    }


}
