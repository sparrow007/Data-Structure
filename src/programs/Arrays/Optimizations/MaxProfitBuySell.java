package programs.Arrays.Optimizations;

public class MaxProfitBuySell {

    public static void main(String[] args) {

       int price[] = {10, 22, 5, 75, 65, 80};

       profit(price, price.length);

    }

    static void profit(int[] input, int n) {
        int maxProfit = 0;

        for (int i = 1; i < n; i++) {

          maxProfit = Math.max( (MaximumDifference.maxElementDiff(input, 0, i) +
                  MaximumDifference.maxElementDiff(input, i + 1, n -1)), maxProfit );

        }

        System.out.println(maxProfit + " is high profit ");
    }

}
