package programs.Stack;

public class Stack_Array {

   static class Stack {

       private int[] a;
       private int top;
       private int size;

       public Stack(int n) {
           a = new int[n];
           this.top = -1;
       }

       public void push(int element) {
          if(top >= a.length-1)  {
              System.err.println("Stack Overflow");
              return;
          }
          top++;
          a[top] = element;
          size++;
       }

       public int pop() {
        if(top < 0)  {
               System.err.println("Stack Underflow");
               return -1;
          }
         int data = a[top];
         size--;
         top--;
         return data;
       }

       public int peek() {
           if(top < 0)  {
               System.err.println("Stack Underflow");
               return -1;
           }
         return a[top];
       }

       public int size() {
          return this.size;
       }

       public void showStack() {

          if(top >= a.length || top  < 0) {
              System.err.println("Either Stack is Overflow or Underflow so can't show element");
              return;
          }

           for (int i = top; i >= 0; i--)
               System.out.println(a[i]);
       }

   }

    public static void main(String[] args) {
        Stack stack = new Stack(3);
        stack.pop();

        stack.showStack();
//
//        stack.pop();
//       System.out.println(" After pop element in the stack");
//        stack.showStack();
//
//
//        stack.pop();
//        System.out.println(" After pop element in the stack");
//        stack.showStack();
//
//
//        stack.pop();
//        System.out.println(" After pop element in the stack");
//        stack.showStack();
//
//        stack.pop();
//        System.out.println(" After pop element in the stack");
//        stack.showStack();

//        stack.pop();
//        System.out.println(" After pop element in the stack");
//        stack.showStack();
    }

}
