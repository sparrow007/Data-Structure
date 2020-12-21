package CP.CF.Div;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.UUID;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {
        int test = in.nextInt();

        while (test--> 0) {

            int length = in.nextInt();

            String input = in.nextString();

            if (input.contains("trygub")) {
                StringBuilder stringBuilder = new StringBuilder(input);
                System.out.println(stringBuilder.reverse());
            }else {
                System.out.println(input);
            }

        }
    }
}
