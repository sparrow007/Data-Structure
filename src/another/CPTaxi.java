package another;

import java.util.Scanner;

public class CPTaxi {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), ans = 0;
        int []car = new int[4];
        for (int i = 0; i < n; i++) {
            car[in.nextInt()-1]++;
        }
        ans+=car[3];
        ans+=car[2];
        car[0] = Math.max(0, car[0] - car[2]);
        ans+=(car[0]+2*car[1] +3)/4;
        System.out.println(ans);
    }

}
