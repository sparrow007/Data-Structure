package programs.Recursions;

import java.util.Scanner;

public class LastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        int x = scanner.nextInt();
        System.out.println(lastIndex(a, n-1, x));
    }


    public static int lastIndex(int[] arr, int idx, int x){
        if(x == arr[idx])
            return idx;

        return lastIndex(arr, idx-1, x);
    }
}
