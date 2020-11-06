package Interview.Arrays;

public class FibonacciDP {

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    static int fib(int n) {

        if(n == 0 || n== 1) return 1;


        return fib(n-1) + fib(n-2);

    }
}
