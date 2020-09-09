package CP.CodeForces;

import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stops = scanner.nextInt();

        int start = scanner.nextInt();
        int inTrains = scanner.nextInt();

        int exceeds = inTrains;

        for (int i = 1; i < stops; i++) {

            int exit = scanner.nextInt();
            int enter = scanner.nextInt();

            inTrains -= exit;
            inTrains += enter;

            exceeds = Math.max(exceeds, inTrains);

        }

        System.out.println(exceeds);
    }
}
