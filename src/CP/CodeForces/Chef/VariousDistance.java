package CP.CodeForces.Chef;

import java.util.Scanner;

public class VariousDistance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        long [] arr = new long[n];

        for (int i = 0; i < n; i++) arr[i] =  Math.abs(scanner.nextInt());

        long md = 0;
        long ed = 0;
        long hg = 0;

        for (long data : arr) {

           md += data;
           ed += (data * data);
           hg = Math.max(hg, data);

        }

        System.out.println(md);
        System.out.println(String.format("%.15f", Math.sqrt((double) ed)));
        System.out.println(hg);

    }

}
