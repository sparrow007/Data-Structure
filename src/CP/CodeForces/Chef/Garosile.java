package CP.CodeForces.Chef;

import java.util.Arrays;
import java.util.Scanner;

public class Garosile {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {

            int n = scanner.nextInt();

            long[] grosile = new long[n];
            long[] cost= new long[n];

            long[] totalCosts = new long[n];

            for (int i = 0; i < n; i++) grosile[i] = scanner.nextLong();

            for (int i = 0; i < n; i++) cost[i] = scanner.nextLong();

            if (n == 1) {
                System.out.println(0);
                continue;
            }


            for (int i = 0; i < n; i++) {

                long totalCost = 0;
                long petrol = 0;
                long totalPetrol= 0;

                for (int j = i; j < n + i; j++, petrol--) {

                    petrol += grosile[j % n];

                    totalCost += cost[j%n]*grosile[j % n];
                    totalPetrol += petrol;

                    if (petrol >= n || totalPetrol >= n) break;

                    if (petrol == 0) {
                        totalCost = 0;
                        break;
                    }


                }

                totalCosts[i] = totalCost;

            }

            for (long data : totalCosts) System.out.println(data + " ");


            Arrays.sort(totalCosts);

            long tp = 0;

            for (int i = 0; i < n; i++) {
                if (totalCosts[i] != 0) {
                    tp = totalCosts[i];
                    break;
                }

            }

         System.out.println(tp);

        }

    }

}
