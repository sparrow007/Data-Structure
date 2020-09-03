package CP.CodeForces;

import java.util.Scanner;

public class BeautifulMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner( System.in);
        int[][] matrix = new int[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = scanner.nextInt();
                if(matrix[i][j] == 1) {
                    System.out.println(Math.abs(i - 2) + Math.abs(j - 2));
                    break;
                }
            }
        }

    }
}
