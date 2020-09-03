package programs.Stack;
import java.util.*;
import java.io.*;
public class OverlapMeeting {


    public static void main(String[] args) throws Exception {
        // write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int j = 0; j < n; j++) {
            String line = br.readLine();
            arr[j][0] = Integer.parseInt(line.split(" ")[0]);
            arr[j][1] = Integer.parseInt(line.split(" ")[1]);
        }

        mergeOverlappingIntervals(arr);
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time

        Pair[] pair = new Pair[arr.length];
        Stack<Pair> meetingStack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            pair[i] = new Pair(arr[i][0], arr[i][1]);
        }

        Arrays.sort(pair);


        for (int i = 0; i < pair.length ; i++) {

            if(i == 0) meetingStack.push(pair[i]);
            else {

                if (meetingStack.peek().et >=  pair[i].st) {

                    Pair top = meetingStack.pop();
                    int et = top.et > pair[i].et ? top.et : pair[i].et;

                    meetingStack.push(new Pair(top.st,  et));
                } else {
                    meetingStack.push(pair[i]);
                }

            }

        }

        Stack<Pair> sortStack  = new Stack<>();
        while(meetingStack.size() > 0 )
            sortStack.push(meetingStack.pop());

        while (sortStack.size() > 0 ) {
            Pair top = sortStack.pop();
            System.out.println(top.st + " " + top.et);
        }

    }

    static class Pair implements Comparable<Pair>{

        private int st, et;

        Pair(int st, int et) {
            this.st = st;
            this.et = et;

        }

        public int compareTo(Pair other) {

            if(this.st != other.st) {
                return this.st - other.st;
            }else {
                return this.et - other.et;
            }

        }

    }
}
