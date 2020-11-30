package CP.CodeForces.EducationDiv2;

import java.util.Scanner;

public class BProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();


        while (n-->0) {
            long x = scanner.nextLong();

            long start = 0;
            long  k = 1;

            long jump = 0;

            boolean isFound = false;

            for (int i = 1; i <= x; i++) {

               if (start == x) {
                   isFound = true;
                   System.out.println(jump);
                   break;
               }else if (start > x) {

                   break;
               }

               start += k;

               k++;

               jump++;

            }

            if (!isFound) {
                long diff = x - start;
                 k = 2;
                for (int i = 0; i < x; i++) {
                    if (start == x) {
                        System.out.println(jump);
                    }

                    if (diff == 1) {
                        jump++;
                        start--;
                    }else {
                        start -= k;
                        k++;
                        jump++;
                    }

                }
            }

        }

    }
}
