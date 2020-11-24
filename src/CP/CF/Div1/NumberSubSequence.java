package CP.CF.Div1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NumberSubSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {
            int n = scanner.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n ; i++) arr[i] = scanner.nextInt();


            int count [] = new int[n+1];
            for (int i = 0; i < n; i++) {

                if (count[arr[i]] != 0)
                    continue;

                int realSequence = 0;
                int sequenceCount = 0;

                for (int j = 0; j < n; j++) {
                    if (i != j && arr[i] != arr[j])  {
                       sequenceCount++;
                    }else {
                        realSequence = Math.max(realSequence, sequenceCount);
                        sequenceCount = 0;
                    }
                }

                count[arr[i]] = realSequence;
            }

            int index = 1;
            int max = count[0];
            for (int i = 1; i < n; i++) {
                if (max < count[i]) {
                    index = i;
                    max = count[i];
                }
            }

            int times = 0;

            for (int i= 0; i < n; i++) {
                if (arr[i] == index && i != 0) {
                    times++;
                }
            }
            if (arr[n-1] != index)
                times++;

            System.out.println(times);
        }


    }
}
