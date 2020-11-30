package CP.CodeForces.Chef;

import java.util.Arrays;
import java.util.Comparator;
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

            Pair[] pairs = new Pair[n];

            for (int i = 0; i < n; i++) {
                Pair pair = new Pair(grosile[i], cost[i]);
                pairs[i] = pair;
            }

            Arrays.sort(pairs, new Comparator<Pair>() {
                @Override
                public int compare(Pair o1, Pair o2) {
                    return (int) (o1.cost - o2.cost);
                }
            });

            


        }

    }

    static class Pair {

         long gas, cost;

        Pair (long gas, long cost) {
            this.gas = gas;
            this.cost = cost;
        }
    }

}
