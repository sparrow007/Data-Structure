package programs.Stack;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class RevHistogramArea {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
        }

        int left[] = new int[a.length];
        int right[] = new int[a.length];

        Stack<Integer> boundaryStack = new Stack<>();

        for (int i = 0; i < a.length; i++) {

            while (boundaryStack.size() > 0 && a[i] <= a[boundaryStack.peek()]) {
                boundaryStack.pop();
            }

            if(boundaryStack.size() == 0) {
                left[i] = -1;
            }else {
                left[i] = boundaryStack.peek();
            }

            boundaryStack.push(i);
        }

        boundaryStack.removeAllElements();

        right[a.length-1] = a.length;

        for (int i = a.length-2; i >= 0; i--) {

            while (boundaryStack.size() > 0 && a[i] <= a[boundaryStack.peek()])
                boundaryStack.pop();

            if(boundaryStack.size() == 0)
                right[i] = a.length;
            else
                right[i] = boundaryStack.peek();

            boundaryStack.push(i);
        }


        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {

            int width = right[i] - left[i] - 1;
            int area = width * a[i];

            maxArea = Math.max(maxArea, area);
        }

        System.out.println(maxArea);

    }
}
