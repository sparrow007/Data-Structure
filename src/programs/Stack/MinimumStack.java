package programs.Stack;

import java.util.*;
public class MinimumStack {

    /*Complete the function(s) below*/
    class GfG{

        int min = 0;

        public void push(int a,Stack<Integer> s)
        {
            //add code here.
            if(s.size() == 0 ) {
                min = a;
            }else if(a < min) {
                int temp = a;
                a = a + a - min;
                min = temp;
            }
            System.out.println(s);
            s.push(a);
        }
        public int pop(Stack<Integer> s)
        {
            //add code here.
            if(s.size() ==0) return -1;

            if(s.peek() < min ) {
                int temp = min;
                min = 2*min - s.pop();
                return temp;
            }

            return s.pop();
        }
        public int min(Stack<Integer> s)
        {
            //add code here.
            return min;
        }
        public boolean isFull(Stack<Integer>s, int n)
        {
            //add code here.
            return n >= s.size();
        }
        public boolean isEmpty(Stack<Integer>s)
        {
            return s.size() == 0 ;
        }
    }
}
