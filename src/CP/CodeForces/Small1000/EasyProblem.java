package CP.CodeForces.Small1000;

import java.util.Scanner;

public class EasyProblem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];

        boolean isHard = false;

        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
            if(a[i] == 1)
                isHard = true;
        }

        if(isHard) System.out.println("HARD");
        else System.out.println("EASY");

    }

}
