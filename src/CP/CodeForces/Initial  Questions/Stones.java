package CP.CodeForces;

import java.util.Scanner;

public class Stones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalStones = scanner.nextInt();
        scanner.nextLine();
        String colorStones = scanner.nextLine();

        int stonesPickup = 0;

        for (int i = 0; i < totalStones-1; i++) {
             char nextChar = colorStones.charAt(i+1);
             char current = colorStones.charAt(i);

             if(current == nextChar) {
                 stonesPickup++;
             }

        }

        System.out.println(stonesPickup);
    }
}
