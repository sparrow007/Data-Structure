package programs.Stack;

import java.util.Stack;

public class StackRecursion {

    static Stack<Integer> reverseStack( int data, Stack<Integer> inputStack, Stack<Integer> newStack) {
        newStack.push(data);

        if(inputStack.size() == 0) return newStack;

        reverseStack(inputStack.pop(), inputStack, newStack);
        return newStack;

    }

    public static void main(String[] args) {

        Stack<Integer> stackElements = new Stack<>();
        stackElements.push(80);
        stackElements.push(40);
        stackElements.push(90);
        stackElements.push(30);
        stackElements.push(60);
        stackElements.push(20);
        System.out.println(stackElements);
        System.out.println("Now we are going to print the elments after reverse");
        Stack<Integer> reverseStack = reverseStack(stackElements.pop(), stackElements, new Stack<>());
        System.out.println(reverseStack);

    }
}
