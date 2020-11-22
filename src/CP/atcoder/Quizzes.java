package CP.atcoder;

import java.util.Scanner;

public class Quizzes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int  x = scanner.nextInt();

        scanner.nextLine();

        String s = scanner.nextLine();

        char input[] = s.toCharArray();

        for (int i = 0; i < n; i++) {
            if (input[i] == 'o') x++;
            else {
                if (x > 0) x--;
            }
        }

        System.out.println(x);
    }
}
