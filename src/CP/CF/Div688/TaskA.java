package CP.CF.Div688;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int test = in.nextInt();

        while (test-- > 0) {

            int n = in.nextInt();
            int m = in.nextInt();

           int arr[] = new int[101];

            for (int i = 0; i < n ;i++) {
                int value = in.nextInt();

                arr[value]++;
            }

            for (int i = 0; i < m; i++) {
                int value = in.nextInt();

                arr[value]++;
            }

            int total = 0;

            for (int i = 0; i <= 100; i++) {

                if (arr[i] > 1) {
                    total++;
                }
            }

            System.out.println(total);


        }
    }
}
