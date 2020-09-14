package programs.Recursions;

import java.util.ArrayList;
import java.util.Scanner;

public class IndexArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }

        int x = scanner.nextInt();

        scanner.close();

        int indexex[] = index(arr, x);

        for (int i = 0; i < indexex.length; i++) {
            System.out.print(indexex[i] + " ");
        }

    }

    public static int[] index(int []arr, int x) {
        return findAllIndex(arr, x, 0);
    }

    public static int[] findAllIndex(int []arr, int x, int start) {

       if (start == arr.length) {
           return new int[0];
       }

      int[] indexArray = findAllIndex(arr, x, start+1);

       if (arr[start] == x) {

           int[] newArray = new int[indexArray.length + 1];
           newArray[0] = start;

           //Shift other element in the array
           for (int i = 0; i < newArray.length-1; i++) {
               newArray[i+1] = indexArray[i];
           }

           return newArray;

       }else {
          return indexArray;
       }

    }
}
