package programs.Stack;

import java.io.*;
import java.util.*;


public class PostfixConversionEvaluation {

   static class B {
        void print() {
            System.out.println("Base");
        }
    }

   static class D extends  B {
        void print() {
            System.out.println("DERIEVED");
        }

        void hello() {
            System.out.println("elel");
        }
    }

    static void call() {
        B b = new D();
        b.print();
    }

    public static void main(String[] args) throws Exception {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String exp = br.readLine();
//
//        Stack<String> infix = new Stack<>();
//        Stack<String> prefix = new Stack<>();
//        Stack<Integer> eval = new Stack<>();
//        Stack<Character> operators = new Stack<>();

     call();


    }

    public static int precedence(char opr) {
        if(opr == '+' || opr == '-')
            return 1;
        else
            return 2;
    }

    public static int operation(int v1, int v2, char op) {
        if (op == '+') {
            return v1 + v2;
        }else if( op == '-') {
            return v1-v2;

        }else if(op == '*') {
            return  v1 * v2;
        }else {
            return v1 / v2;
        }
    }
}
