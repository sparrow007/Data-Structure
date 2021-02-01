package programs.dp;

import java.util.Scanner;

public class MinimumCostMaze {

    public static void main(String[] args) {
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
        dp[row-1][col-1]= mat [row-1][col-1];

        for (int i = row - 1; i >= 0; i--)  {
            for (int j = col - 1; j >= 0; j--) {
                if (i == row - 1 && j == col - 1) continue;

                if(j + 1 >= col){
                    //limit col check only row
                    dp[i][j] = mat[i][j] + dp[i+1][j];
                }else  if (i + 1 >= row) {
                    dp[i][j] = mat[i][j] + dp[i][j+1];
                }else {
                    int value = Math.min(dp[i+1][j], dp[i][j+1]);
                    dp[i][j] = mat[i][j] + value;
                }
            }
        }

        System.out.println(dp[0][0]);
    }

}
