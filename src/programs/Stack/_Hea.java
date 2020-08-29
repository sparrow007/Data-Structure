package programs.Stack;

import java.util.Scanner;

public class _Hea {

    /*
    *
    * Use normal method to implement the stack
    * */

    static class Stacks {

        private int arr[];

        private int stackTop[];

        public Stacks(int stackNumber, int stackSize) {

            stackTop = new int[stackNumber];
            arr = new int[stackSize];

            int initialTop = stackSize/stackNumber;
            for (int i = 1; i <= stackNumber; i++) {
                 stackTop[i-1] = initialTop * i;
            }

        }

    }

    public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int stackSize = scanner.nextInt();
    int n = scanner.nextInt();


    }

}
