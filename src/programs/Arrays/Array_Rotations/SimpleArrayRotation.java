package programs.Arrays.Array_Rotations;

import java.util.Scanner;

public class SimpleArrayRotation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        while(test--> 0) {

            //Take input
            int array_length = scanner.nextInt();
            int rotation = scanner.nextInt();

            int[] elements = new int[array_length];

            for (int start = 0; start < array_length; start++)
                elements[start] = scanner.nextInt();

            displayArray((leftRotate(elements, rotation, array_length)));

            System.out.println();

        }

    }

    static int[] rotateByTemp(int[] elements, int rotation) {
        int d = rotation % elements.length;
        int[] temp = new int[d];

        for (int i = 0; i < d; i++)
            temp[i] = elements[i];

        for (int i = 0; i < elements.length-d; i++) {
            elements[i] = elements[i+d];
        }
        for (int i = 0; i < d; i++) {
            elements[elements.length - d + i] =  temp[i];
        }

        return elements;
    }

    static void displayArray(int [] elements) {
        //print the element of the array
        for (int start = 0; start < elements.length; start++) {
            System.out.print(elements[start] + " ");
        }

    }


    static int[] rotateOneByOne(int [] elements, int rotation, int array_length) {

        int rotations_number = rotation % array_length;

        //Loop through roatation
        for (int start = 0; start < rotations_number; start++) {

            //cache the first element of the array
            int temp = elements[0];

            //for every rotation we need to shift the element
            for (int array_start = 0; array_start < array_length - 1; array_start++) {

                //repelace the element of the array
                elements[array_start] = elements[array_start + 1];

            }

            //All the elements of the array will be shifted
            //push the first element at the last of the array

            elements[array_length - 1] = temp;

        }

        return elements;
    }


    /*Function to left rotate arr[] of size n by d*/
    static int[] leftRotate(int arr[], int d, int n)
    {
        /* To handle if d >= n */
        d = d % n;
        int i, j, k, temp;
        int g_c_d = gcd(d, n);
        for (i = 0; i < g_c_d; i++) {
            /* move i-th values of blocks */
            temp = arr[i];
            j = i;
            int count = 0;
            System.out.println();
            while (true) {
                System.out.print(++count + " ");
                k = j + d;
                if (k >= n)
                    k = k - n;
                if (k == i)
                    break;
                arr[j] = arr[k];
                j = k;

            }
            System.out.println("\n Upper loop " + i);
            arr[j] = temp;
        }

        return arr;
    }

   static int gcd(int a, int b)
    {
        if (b == 0)
            return a;
        else
            return gcd(b, a % b);
    }


}
