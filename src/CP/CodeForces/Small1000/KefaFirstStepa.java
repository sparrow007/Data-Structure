package CP.CodeForces.Small1000;

import java.util.Scanner;

public class KefaFirstStepa {

    static int maxLength = 0;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < length; i++)
            arr[i] = scanner.nextInt();

        

//        int maxLength = 0;
//
//        int lastLength = 0;
//
//        for (int i = 0; i < length-1; i++) {
//
//            if (arr[i] <= arr[i+1]) {
//                lastLength += 1;
//
//            }else {
//                if (maxLength < lastLength) {
//                    maxLength = lastLength;
//                }
//
//                lastLength = 0;
//
//            }
//
//        }
//
//        System.out.println(Math.max(lastLength + 1, maxLength + 1) );

    }
}
