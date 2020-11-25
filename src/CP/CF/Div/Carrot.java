package CP.CF.Div;

import java.util.Scanner;

public class Carrot {

    public static void main(String[] args) {
        Scanner  scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long[] arr = new long[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextLong();

        int start = 0;

        int end = n-1;

        long eatenCarrot = 0;

        long firstRabbit = 0;

        long lastRabbit = 0;

        long i = 0;
        while(start <= end && i < n ) {

            if (start == end) {
                if (arr[start] >= firstRabbit) {
                    eatenCarrot++;
                }else if (arr[end] >= lastRabbit) {
                    eatenCarrot++;
                }
                break;
            }

            if (arr[end] >= lastRabbit) {
                lastRabbit = arr[end];
                eatenCarrot++;
                end--;
            }

            if (arr[start] >= firstRabbit) {
                firstRabbit = arr[start];
                eatenCarrot++;
                start++;
            }

            i++;
        }

        System.out.println(eatenCarrot);
    }
}
