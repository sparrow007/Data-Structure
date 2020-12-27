package CP.codeChef;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ZeroOneSwap {
    public static void main(String[] args) {

        FastReader scanner = new FastReader();
        //Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();


        while (test--> 0) {

            int size = scanner.nextInt();

            String s = scanner.nextLine();
            String p = scanner.nextLine();

            char a[] = s.toCharArray();
            char b[] = p.toCharArray();


            int start = 0;

            for (int i = 0; i < size; i++) {
                if (a[start] == b[start]) {
                    start++;
                    continue;
                }

                for (int j = start; j < size; j++) {
                    if (a[j] == b[start]) {

                        char temp = a[start];
                        a[start] = a[j];
                        a[j] = temp;
                        i--;
                        break;
                    }
                }
            }

            if (start == size) {
                System.out.println("Yes");
            }else  {
                System.out.println("No");
            }

        }

    }


    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(new
                    InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }

        long nextLong()
        {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
