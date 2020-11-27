package CP.atcoder;

import java.util.Scanner;

public class DBanned {


    static long nc2 (long n) {
        return (n*(n-1))/ 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] =scanner.nextInt();
        }

        int map[] = new int[n+1];

        //Storing the values in the map
        for (int i = 0; i < n; i++) {
            map[arr[i]]++;
        }

        long ans = 0;

        for (int i = 1; i <= n; i++) {
            ans += nc2(map[i]);
        }

       // System.out.println(ans + " ans");

        for (int i = 0; i < n; i++) {
          //  System.out.println("map value " + map[arr[i]]);
            System.out.println(ans - (map[arr[i]]-1));
        }


    }
}
