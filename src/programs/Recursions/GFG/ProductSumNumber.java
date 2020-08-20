package programs.Recursions.GFG;

import java.util.Scanner;

public class ProductSumNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println(getProduct(n,y, 0));
    }

    public static int getProduct(int x, int y, int sum) {
        if(y == 0)
            return sum;
        return getProduct(x, y-1, sum + x);
    }
}
