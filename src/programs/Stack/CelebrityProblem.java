package programs.Stack;
import java.util.*;
import java.io.*;
public class CelebrityProblem {

    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            for (int k = 0; k < n; k++) {
                arr[j][k] = line.charAt(k) - '0';
            }
        }

        findCelebrity(arr);

    }

    public static void findCelebrity(int[][] arr) {
        // if a celebrity is there print it's index (not position), if there is not then
        // print "none"

        //Add all the possible celebrity (row) in the stack
        Stack<Integer> celebrityStack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            celebrityStack.push(i);
        }

        while (celebrityStack.size() >= 2) {

            int i = celebrityStack.pop();
            int j = celebrityStack.pop();

            if(arr[j][i] == 1) {
                celebrityStack.push(i);
            }else {
                celebrityStack.push(j);
            }

        }

        int spot = celebrityStack.pop();
        for (int i = 0; i < arr.length; i++) {

            if(i != spot)
                if(arr[spot][i] == 1 || arr[i][spot] != 1) {
                    System.out.println("none");
                    return;
                }

        }

        System.out.println(spot);

    }

}
