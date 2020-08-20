package programs.CodeAugLong;

import java.util.ArrayList;
import java.util.Scanner;

public class LINCHESS {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();
        for(int i =0; i < test; i++) {

            int n = scanner.nextInt();
            int k = scanner.nextInt();

            ArrayList<Integer> list = new ArrayList<>(n);
            for(int j = 0; j < n; j++) {
                int temp = scanner.nextInt();
                list.add(temp);
            }
            int ans = -1;
            int step = Integer.MAX_VALUE;
            for(int j=k/2; j >=1 ;j--) {
                if(k%j == 0) {
                    if(list.contains(j)) {
                        ans = j;
                        break;
                    }
                }
            }
            System.out.println(ans);

        }
    }
}
