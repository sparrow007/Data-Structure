package another;

import java.util.Arrays;
import java.util.Scanner;

public class StickProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-->0) {
            int length = scanner.nextInt();

            int[] sticks = new int[length];

            for (int i = 0; i < sticks.length; i++)
                sticks[i] = scanner.nextInt();

            int move = 0;

            Arrays.sort(sticks);

            boolean isAllZero = true;
            for (int i = 0; i < sticks.length; i++)
                if(sticks[i] != 0) {
                    isAllZero = false;
                    break;
                }

            if(isAllZero) {
                System.out.println(0);
                continue;
            }
            for (int i = 0; i < sticks.length-1; i++) {

                if (sticks[i] == sticks[i+1]) move++;

            }
            int pref = length / 2;

            if(move == 0) System.out.println(length);
            else if(pref >= move)
                System.out.println(length - move);
            else System.out.println(move);



        }


    }
}
