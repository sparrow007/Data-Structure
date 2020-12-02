package CP.CF.Div;

import FastIO.InputReader;
import FastIO.OutputWriter;

public class TaskC {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int test = in.nextInt();

        while (test-->0) {

            long a = in.nextLong();
            long b = in.nextLong();

            if (a == 1) {
                System.out.println(a);
                continue;
            }

            int s = 2;

            int div = 1;

            while (true) {

                if (div == b ) {
                    System.out.println(s);
                    break;
                }

                if (a % s != 0) div++;

                s += 1;

            }
        }
    }
}
