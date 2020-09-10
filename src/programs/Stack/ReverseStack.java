package programs.Stack;

import java.util.Stack;

public class ReverseStack {

    private static Stack<Integer> st = new Stack<>();

    static void sortAtBottom(int x) {

        if (st.isEmpty()) {
            System.out.println(x);
            st.push(x);
        }else {

            int pop = st.pop();

            if(x < pop)
              sortAtBottom(x);
            else {
                st.push(pop);
                st.push(x);
                return;
            }
              st.push(pop);
        }

    }

    public static void sort()
    {
        if (st.size() > 0) {

            int x = st.pop();
            sort();

            sortAtBottom(x);

        }
    }

    static void insertAtBottom(int x) {

        if(st.isEmpty()) st.push(x);
        else {

            int a = st.pop();
            insertAtBottom(x);

            st.push(a);

        }

    }

    static void reverse() {

        if (st.size() > 0) {

            int x = st.pop();
            reverse();

            insertAtBottom(x);
        }

    }

    static Stack<Integer> reverseStack(Stack<Integer> stack, int top, Stack<Integer> updateStack) {


        if (stack.size() == 0) {
            updateStack.push(top);
            return updateStack;
        }

        updateStack.push(top);

        return reverseStack(stack, stack.pop(), updateStack);


    }



    public static void main(String[] args) {

        st.push(10);
        st.push(70);
        st.push(30);
        st.push(20);
        st.push(80);
        System.out.println(st);
        sort();

        int size = st.size();
        for (int i = 0; i < size; i++) {
            System.out.print(st.pop() + " ");
        }

    }
}
