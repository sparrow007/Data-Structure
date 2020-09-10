package programs.Queue;

import programs.LinkList.DoubleEnded;

public class DoubleEndedQueue {

    private DoubleEnded doubleEnded;

    public DoubleEndedQueue() {
        doubleEnded = new DoubleEnded();
    }

    //Insert the element in the queue from the last
    public  void enqueue(int val) {
        doubleEnded.insertLast(val);
    }

    //Remove the element from the queue
    public int dequeue() {
        int data = doubleEnded.removeFirst();

        if (data == -1) {
            System.out.println("Queue underflow");
            return data;
        }

        return data;
    }

    public void displayQueue() {
        doubleEnded.display();
    }
}
