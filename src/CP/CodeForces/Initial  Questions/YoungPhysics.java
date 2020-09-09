package CP.CodeForces;

import java.util.Scanner;

public class YoungPhysics {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int xVector = 0;
        int yVector = 0;
        int zVector = 0;

        while(n-->0) {

            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int z = scanner.nextInt();

            xVector += x;
            yVector += y;
            zVector += z;

        }

        if (xVector == 0 && yVector == 0 && zVector == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
