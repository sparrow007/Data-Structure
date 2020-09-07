package CP.CodeForces;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Taxi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] groups = new int[length];

        for (int i = 0; i < length; i++) {
            groups [i] = scanner.nextInt();
        }

        int endIndex = length - 1;
        int startIndex = 0;

        int taxiNumber = 0;

        while (true) {

            int group = groups[endIndex];
            if (group == 4) {
                taxiNumber++;
                endIndex--;
                continue;
            }

            for (int i = 0; i < endIndex - 1; i++) {

                if(group + groups[i] == 4) {

                }

            }

        }


    }
}
