package programs;

import programs.Queue.DoubleEndedQueue;
import programs.Stack.StackDoubleEnded;

public class DoubleEndedControl {

    public static void main(String[] args) {

        DoubleEndedQueue doubleEndedQueue = new DoubleEndedQueue();
        doubleEndedQueue.enqueue(50);
        doubleEndedQueue.enqueue(80);
        doubleEndedQueue.enqueue(40);
        doubleEndedQueue.enqueue(10);
        doubleEndedQueue.displayQueue();

        doubleEndedQueue.dequeue();
        doubleEndedQueue.dequeue();
        doubleEndedQueue.dequeue();
        doubleEndedQueue.dequeue();
        doubleEndedQueue.displayQueue();

        System.out.println("Stack Implementation");

        StackDoubleEnded stackDoubleEnded = new StackDoubleEnded();
        stackDoubleEnded.push(50);
        stackDoubleEnded.push(40);
        stackDoubleEnded.push(30);
        stackDoubleEnded.push(90);
        stackDoubleEnded.display();
        stackDoubleEnded.pop();
        stackDoubleEnded.display();


    }
}
