package CP.CodeForces.Small1500;

import java.util.Arrays;
import java.util.Scanner;

public class Ribbon {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++)
            arr[i] = scanner.nextInt();

        scanner.close();

        Arrays.sort(arr);

        int first = (int) Math.ceil((float)n / arr[0]) ;

        int sum = arr[0] * first;

        for (int i = 0; i < first; i++) {

            

        }

        System.out.println(first);


    }
}
