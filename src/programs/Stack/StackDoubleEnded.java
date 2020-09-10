package programs.Stack;

import programs.LinkList.DoubleEnded;

public class StackDoubleEnded {

    private DoubleEnded doubleEnded;

    public StackDoubleEnded() {
        doubleEnded = new DoubleEnded();
    }

    public void push(int val) {
        doubleEnded.insertFirst(val);
    }

    public int pop() {

        int data = doubleEnded.removeFirst();
        if (data == -1) {
            System.out.println("Stack underflow");
        }

        return data;

    }

    public void display() {
        doubleEnded.display();
    }

    public int size() {
        return doubleEnded.size();
    }

}
