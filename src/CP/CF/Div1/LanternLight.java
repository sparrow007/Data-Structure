package CP.CF.Div1;

import java.util.Arrays;
import java.util.Scanner;

public class LanternLight {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int l = s.nextInt();

        double[] a = new double[n];

        for (int i = 0; i < n; i++) a[i] = s.nextInt();

        Arrays.sort(a);

        double d = 0.0;

        for (int i = 0; i < n; i++) {

           if (i == 0) {
               d = Math.max(d, (double) a[i]);
           }else {
               double diff = Math.abs(a[i] - a[i-1]) / 2;
               d = Math.max(d, diff);
           }

        }

        double lastDiff = Math.abs(a[n-1]- l);
        d = Math.max(d, lastDiff);

        System.out.println(d);
    }
}
