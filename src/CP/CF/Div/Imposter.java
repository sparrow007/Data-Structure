package CP.CF.Div;

import java.util.Scanner;

public class Imposter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int k = scanner.nextInt();

        int arr[] = new int[n+1];

        for (int i = 1; i <= k; i++ ) {
            int value = scanner.nextInt();
            arr[value]++;
        }

        int noTask = 0;

        for (int i = 1; i <= n; i++) {
            if (arr[i] == 0) noTask++;
        }

        if (noTask == 1) System.out.println("YES");
        else System.out.println("NO");


    }

}
