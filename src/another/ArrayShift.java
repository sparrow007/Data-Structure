package another;

import java.util.Scanner;

public class ArrayShift {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = scanner.nextInt();

        pushZerosAtEnd(arr);

    }

    public static void pushZerosAtEnd(int[] arr) {

        int start = 0;
        int end = 0;

        int i = 0;
        for (; i < arr.length; i++) {

            if (start < arr.length && arr[start] != 0) {
                start++;
                end = start + 1;
            }else if (end < arr.length && arr[end] == 0) {
                end++;
            }else if (start < arr.length && end < arr.length) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end++;

            }

        }




//        int length = arr.length;
//
//        int zeroPosition = 0;
//
//        for (int i = 0; i < length; i++) {
//
//            if(arr[zeroPosition] == 0) {
//                for (int j = zeroPosition; j < length; j++) {
//                    if(arr[j] != 0) {
//                        int temp = arr[zeroPosition];
//                        arr[zeroPosition] = arr[j];
//                        arr[j] = temp;
//                        break;
//                    }
//                }
//            }else zeroPosition++;
//
//        }
//
//        for (int i = 0; i < length; i++) {
//            System.out.print(arr[i] + " ");
//        }

    }
}
