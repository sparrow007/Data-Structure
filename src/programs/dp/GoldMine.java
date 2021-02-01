package programs.dp;

import java.util.Scanner;

public class GoldMine {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        int row = scanner.nextInt();
        int col = scanner.nextInt();

        int[][] mat = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }

        int[][] dp = new int[row][col];

        for (int i = 0; i < row; i++) {
            dp[i][col-1] = mat[i][col - 1];
        }

        for (int i = col - 2; i >= 0; i--) {
            for (int j = 0; j < row; j++) {

                if (j - 1 < 0) {
                    dp[j][i] = Math.max(dp[j][i+1], dp[j+1][i+1])+mat[j][i];
                }else if (j + 1 >= row) {
                    dp[j][i] = Math.max(dp[j][i+1], dp[j-1][i+1]) + mat[j][i];
                }else {
                    dp[j][i] = Math.max(dp[j][i+1], Math.max(dp[j+1][i+1], dp[j-1][i+1])) +mat[j][i];
                }

            }
        }



        //check for 1st colomn for max values
        int max = 0;
        for (int i = 0; i < row; i++) {
            max = Math.max(dp[i][0], max);
        }

        System.out.println(max);

    }



    static void countMaxGold(int[][] mat, int[][]dp, int row, int col, int cost) {

        if (col + 1 >= mat[0].length) {
            dp[row][col] = mat[row][col];
            return;
        }
        if (col > mat[0].length || row > mat.length) return;

        if (dp[row][col] > 0) return;

        if (row - 1 < 0) {
            if (mat[row][col + 1] > mat[row + 1][col+1]) {
                countMaxGold(mat, dp, row, col + 1, cost + mat[row][col+1]);
                dp[row][col] = dp[row][col + 1];

            }else {
                countMaxGold(mat, dp, row+1, col + 1, cost + mat[row+1][col+1]);
                dp[row][col] = dp[row+1][col + 1];

            }
        }else if (row + 1 >= mat.length) {
            if (mat[row][col + 1] > mat[row - 1][col+1]) {
                countMaxGold(mat, dp, row, col + 1, cost + mat[row][col+1]);
                dp[row][col] = dp[row][col + 1];

            }else {
                countMaxGold(mat, dp, row, col + 1, cost + mat[row-1][col+1]);
                dp[row][col] = dp[row-1][col + 1];

            }
        }else  {
            if (mat[row][col+1] > mat[row+1][col+1] && mat[row][col+1] > mat[row-1][col+1]) {
                countMaxGold(mat, dp, row, col + 1, cost + mat[row][col+1]);
                dp[row][col] = dp[row][col + 1];

            }else if (mat[row+1][col+1] > mat[row][col+1] && mat[row+1][col+1] > mat[row-1][col+1]) {
                countMaxGold(mat, dp, row+1, col + 1, cost + mat[row+1][col+1]);
                dp[row][col] = dp[row+1][col + 1];

            }else {
                countMaxGold(mat, dp, row-1, col + 1, cost + mat[row-1][col+1]);
                dp[row][col] = dp[row-1][col + 1];
            }
        }

       int max = dp[row][col];

        for (int i = 1; i < mat.length; i++)
        countMaxGold(mat, dp, row+i, col + 1,  mat[row+i][col]);
    }
}
