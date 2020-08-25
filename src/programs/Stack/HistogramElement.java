package programs.Stack;

import java.io.*;
import java.util.*;

public class HistogramElement {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        // code
        int[] nge = new int[a.length];

        Stack<Integer> st = new Stack<>();
        st.push(a.length - 1);

        nge[a.length-1] = a.length;

        //Find the each index greater element
        for(int i = a.length - 2; i >= 0; i--) {

            while(st.size() > 0 && a[i] >= a[st.peek()] ) {
                st.pop();
            }

            if(st.size() == 0) {
                nge[i] = a.length;
            }else {
                nge[i] = st.peek();
            }

            st.push(i);
        }

        //Now get the element in range;

        for(int i = 0; i <= a.length - k ; i++) {

            int j = i;

            while(nge[j] < i + k) {
                j = nge[j];
            }

            System.out.println(a[j]);
        }

    }
}
