package CP.CF.DivisionRound648;

import FastIO.InputReader;
import FastIO.OutputWriter;

import java.util.ArrayList;

public class TaskA {
    public void solve(int testNumber, InputReader in, OutputWriter out) {

        int test = in.nextInt();

        while (test--> 0) {

            String input = in.nextString();

            int decimal = 1;
            int length = input.length();
            int k = Integer.parseInt(input);

            ArrayList<Integer> outData = new ArrayList<>();

            while (k != 0){

                int r = k % 10;

                if (r != 0) {
                    outData.add(r*decimal);
                }

                k = k / 10;

                decimal *= 10;

            }


            System.out.println(outData.size());
            for (int data : outData) {
                System.out.print(data + " ");
            }

            System.out.println();

        }

    }

    static void printNumber(int n) {

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (n != 0) {
            if (n % 10 == 0) {
               arrayList.add(n);
               break;
            } else {
                arrayList.add(n % 10);
                n = n / 10;
            }

        }

    }
}
