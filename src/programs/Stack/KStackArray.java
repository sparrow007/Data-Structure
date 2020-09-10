package programs.Stack;


//Important concept for making the array for the stack
public class KStackArray {

    private int a[];
    private int next[];
    private int top[];

    int n, k;
    int free;

    public KStackArray(int n , int k) {
        this.n = n;
        this.k = k;
        a = new int[n];
        next = new int[n];
        top = new int[k];
        free = 0;

        //Initialize all the tops of each stack to -1
        for (int i = 0 ; i < k; i++)
            top[i] = -1;

        //Initialize the all the next fee slot by the next value
        for (int i = 0; i < n-1; i++)
            next[i] = i+1;

        next[n-1] = -1;

    }

    private boolean isFull() {
        return free == -1;
    }

    private boolean isEmpty(int sn) {
        return top[sn] == -1;
    }

    public void push(int item, int sn) {

       if(isFull()) {
           System.out.println("Stack Overflow");
           return;
       }

        int i = free;

        free = next[i];

        next[i] = top[sn];

        top[sn] = i;

        a[i] = item;

    }

    public int pop(int sn) {

        if (isEmpty(sn)) {
            System.out.println("Stack underflow");
            return -1;
        }

        int i = top[sn];

        top[sn] = next[i];

        next[i] = free;
        free = i;

        return a[i];

    }

    public static void main(String[] args) {

        KStackArray ks = new KStackArray(10, 3);


        ks.push(15, 2);
        ks.push(45, 2);

        // Let us put some items in stack number 1
        ks.push(17, 1);
        ks.push(49, 1);
        ks.push(39, 1);

        // Let us put some items in stack number 0
        ks.push(11, 0);
        ks.push(9, 0);
        ks.push(7, 0);

        System.out.println("Popped element from stack 2 is " + ks.pop(2));
        System.out.println("Popped element from stack 1 is " + ks.pop(1));
        System.out.println("Popped element from stack 0 is " + ks.pop(0));

    }
}
