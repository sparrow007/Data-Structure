package programs.Stack;

import java.util.Scanner;
import java.util.Stack;

public class BaseBallGame {

    static boolean isDigit(String string) {
        try {
            Integer.parseInt(string);
            return true;
        }catch (NumberFormatException exp) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        String[] ops = new String[length];

        scanner.nextLine();

        for (int i = 0; i < length; i++)
            ops[i] = scanner.nextLine();


        int sum = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < length; i++) {

            char ch = ops[i].charAt(0);

            if (isDigit(ops[i])) {
                int data = Integer.parseInt(ops[i]);
                sum += data;
                st.push(data);

            }else if (ch == 'C') {
               int data =  st.pop();
               sum -= data;

            }else if (ch == 'D'){

                int data = st.peek() * 2;
                sum += data;
                st.push(data);

            }else if (ch == '+'){

                if (st.size() >= 2) {

                    int v2 = st.pop();
                    int v1 = st.pop();

                    int ans = v1 + v2;
                    sum += ans;

                    st.push(v1);
                    st.push(v2);
                    st.push(ans);

                }

            }

        }

        System.out.println(sum);

    }

    public int calPoints(String[] ops) {

        int sum = 0;

        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < ops.length; i++) {

            char ch = ops[i].charAt(0);

            if (isDigit(ops[i])) {
                int data = Integer.parseInt(ops[i]);
                sum += data;
                st.push(data);

            }else if (ch == 'C') {
                int data =  st.pop();
                sum -= data;

            }else if (ch == 'D'){

                int data = st.peek() * 2;
                sum += data;
                st.push(data);

            }else if (ch == '+'){

                if (st.size() >= 2) {

                    int v2 = st.pop();
                    int v1 = st.pop();

                    int ans = v1 + v2;
                    sum += ans;

                    st.push(v1);
                    st.push(v2);
                    st.push(ans);

                }

            }

        }
       return sum;
    }

}
