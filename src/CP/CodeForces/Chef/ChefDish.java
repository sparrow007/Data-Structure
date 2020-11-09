package CP.CodeForces.Chef;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ChefDish {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int test = input.nextInt();

        while(test-->0) {

            int array_length = input.nextInt();

            Integer[] array = new Integer[array_length];

            for (int i = 0; i < array_length; i++) {
                array[i] = input.nextInt();
            }

            Arrays.sort(array, Collections.reverseOrder());

            int startBunner = array[0];

            int minimumTime = 0;

            for (int i = 1; i < array.length; i++) {

                minimumTime += Math.min(array[i], startBunner);
                startBunner = Math.abs(startBunner - array[i]);

            }

            System.out.println(minimumTime + startBunner);

        }
    }
}
