package programs.Arrays;




/*package whatever //do not write package name here */

import java.util.*;
        import java.lang.*;
        import java.io.*;

public class Interaction {
}

class GFG {
    public static void main (String[] args) {
        //code
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test > 0) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            int a[] = new int[n];
            int b[] = new int[m];

            HashSet<Integer> hset = new HashSet<>();
            HashSet<Integer> hset1 = new HashSet<>();

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if(!hset.contains(a[i]))
                    hset.add(a[i]);
            }
            for (int i = 0; i < m; i++) {
                b[i] = scanner.nextInt();
                if(!hset1.contains(b[i]))
                    hset1.add(b[i]);

            }

            Iterator<Integer> i = hset.iterator();
            int count = 0;
            while (i.hasNext())
            {
                if(hset1.contains(i.next())) {
                    count++;
                }
            }

            System.out.println(count);

            test--;
        }
    }
}