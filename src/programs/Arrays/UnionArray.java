package programs.Arrays;
import java.io.*;
import java.util.*;
public class UnionArray {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while(t > 0) {

            int n = scanner.nextInt();
            int m = scanner.nextInt();

            HashSet<Integer> hset = new HashSet<>();

            for(int i = 0; i < n+m; i++) {
                int num = scanner.nextInt();

                if(hset.contains(num)) {
                    continue;
                }else {
                    hset.add(num);
                }

            }

            System.out.println(hset.size());

            t--;
        }


    }
}
