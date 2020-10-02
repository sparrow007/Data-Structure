package CP.CodeForces.Chef;
/* package codechef; // don't place package name! */

import java.util.*;
        import java.lang.*;
        import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CovidRun
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here

        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test-->0) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            int jumpCity = (x+k)%n;
            boolean attackCity = false;

            while(x != jumpCity) {

                if(jumpCity == y) {
                    attackCity = true;
                    break;
                }
                jumpCity = (jumpCity+k)%n;

            }

            if (attackCity) {
                System.out.println("YES");
            }else
                System.out.println("NO");

        }
    }
}
