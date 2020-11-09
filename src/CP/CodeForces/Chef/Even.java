package CP.CodeForces.Chef;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

public class Even {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();

        ArrayList<Long> num = new ArrayList<>();
        for (long i=1; i<=Math.sqrt(n); i++)
        {
            if (n%i==0)
            {
                // If divisors are equal, print only one
                if (n/i == i) {
                    num.add(i);
                }

                else // Otherwise print both{
                {
                    num.add(i);
                    num.add((n/i));
                }

            }
        }
        Collections.sort(num);

        for(long data : num) System.out.println(data);




    }
}
