package programs.Arrays.Optimizations;

public class MaxProfitBuySell {

    public static void main(String[] args) {

       int price[] = {10, 22, 5, 75, 65, 80};

       maxProfit(price, price.length);

    }

    static void maxProfit(int price[], int n) {

        int[] profit = new int[n];

        int max_price= price[n-1];

        //Right to left traversal and store the maximum in one trasaction


        for (int i = n-2; i >= 0; i--) {

            if (price[i] > max_price)
                max_price = price[i];

            profit[i] = Math.max(profit[i + 1], max_price - price[i]);

        }

        int min_price = price[0];
        for (int i = 1; i < n; i++) {

            if(price[i] < min_price) {
                min_price = price[i];
            }

            profit[i] = Math.max(profit[i-1], profit[i] + price[i] - min_price);

        }

        System.out.println(profit[n-1]);

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
