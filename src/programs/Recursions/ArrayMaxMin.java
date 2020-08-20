package programs.Recursions;

import java.util.Scanner;

public class ArrayMaxMin {

    private static int min = Integer.MAX_VALUE;
    private static int max = Integer.MIN_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scanner.nextInt();

        minAndMax(a, 0);

        System.out.println("Min " + min);
        System.out.println("Max " + max);

    }

    public static void minAndMax(int a[], int index) {

        if(a.length == index)
            return;

        int value = a[index];

        min = Math.min(min, value);
        max = Math.max(max, value);
        minAndMax(a, ++index);

    }
}
