package CP.CodeForces;

import java.util.Scanner;

public class Team {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int problemLength = scanner.nextInt();

        int totalSolution = 0;

        while (problemLength > 0) {
            int patya = scanner.nextInt();
            int vasya = scanner.nextInt();
            int tonya = scanner.nextInt();

            int total = patya + vasya + tonya;

            if(total >= 2) {
                totalSolution++;
            }

            problemLength--;
        }
        System.out.println(totalSolution);
    }
}
