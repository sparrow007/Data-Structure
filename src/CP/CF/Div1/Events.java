package CP.CF.Div1;

import java.util.Scanner;

public class Events {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-- > 0) {

            int x  = scanner.nextInt();
            int n = scanner.nextInt();

            int [] arr = new int[n];

            for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

            long totalSub = 0;

            for (int i = 0; i < n; i ++) {

                if (arr[i] < x) totalSub++;

                long subParts = arr[i];

                for (int j = i + 1; j < n; j++) {

                    subParts *= arr[j];

                    if (subParts < x) {
                      //  System.out.println(i + " to " + j);
                        totalSub++;
                    }else break;

                }
            }

            System.out.println(totalSub);

        }
    }

}
