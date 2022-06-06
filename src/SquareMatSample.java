import java.util.Scanner;
import java.util.Stack;

public class SquareMatSample {
   static int max = 0;
    public static void main(String[] args) {
            Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

        Stack<Character> st = new Stack<>();
            String[] strArr = {".;", "abc", "def", "ghi", "jkl",
                    "mno", "pqrs", "tu", "vwx", "yz"};

            String str = "abc";

            char ch = '5';
            int a = ch;
            //For Array inputs
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scn.nextInt();
            }

        int[][] mat = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
    }

}
