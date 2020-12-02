package CP.CF.Div;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskB {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int test= in.nextInt();

        while (test-->0) {

            long n = in.nextLong();
            long k = in.nextLong();

            if (n % k == 0) {
                out.println("YES");
                for (int i =0; i < k; i++)
                    out.print(n/k + " ");

                out.println();

            }else {
                ArrayList<Long> arrayList = new ArrayList<>();
                long value = 2;
                arrayList.add(2L);
                for (int i = 2; i < k; i++) {
                    value += 2;
                    arrayList.add(2L);
                }

                if ((n - value) > 0 &&   (n - value)  % 2 == 0) {
                    arrayList.add((n-value));
                    out.println("YES");
                    for (long data : arrayList) out.print(data + " ");
                    out.println();

                    continue;
                }

                arrayList.clear();

                long data = 1L;

                arrayList.add(1L);

                for (int i = 2; i < k; i++) {
                    data += 1L;
                    arrayList.add(1L);
                }


                if ((n - data) > 0 &&  (n - data)  % 2 != 0) {
                    arrayList.add((n-data));
                    out.println("YES");
                    for (long d : arrayList) out.print(d + " ");
                    out.println();
                    continue;

                }

                out.println("NO");

            }



        }

    }
}
