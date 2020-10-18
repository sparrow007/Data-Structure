package programs.Arrays.Array_Rearrange;

import java.util.Scanner;

public class RearrangePostiveNegative {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) arr[i] = scanner.nextInt();

        arrangePositiveNegative(arr, n);


    }

   static void arrangePositiveNegative(int arr[], int n) {

       int[] pos = new int[n];
       int[] neg = new int[n];
       int j = 0;
       for (int i = 0; i < n; i++) {
           if(arr[i] >= 0) {
               pos[j]= arr[i];
               j++;
           }
       }

//       for (int element : pos) System.out.print(element + " ");
//
//       System.out.println();

       int k = 0;
        for (int i = 0 ; i < n; i++) {
            if(arr[i] < 0) {
                neg[k]= arr[i];
                k++;
            }
        }

//       for (int element : neg) System.out.print(element + " ");
//
//       System.out.println();

        int posPointer = 0, negPointer = 0;
        int i = 0;
        while(i < n) {

           if(i  % 2 == 0) {
              if(posPointer < j) {
                  arr[i] = pos[posPointer++];
              }else {
                  arr[i] = neg[negPointer++];
              }
           }else {
               if( negPointer < k) {
                   arr[i] = neg[negPointer++];
               }else {
                   arr[i] = pos[posPointer++];
               }
           }

            i++;
        }

       //for (int element : arr) System.out.print(element + " ");

    }

    void rearrange(int arr[], int n) {

        //first partition the array like quick sort and make
        //it into negatvie and positive part of the array
        int i = -1, temp;
        for (int j = 0; j < n; j++) {

            if(arr[j] < 0) {
                i++;
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }

        //after the above codes our array will be divided into
        ///positive and negative parts

        int post = i + 1, neg = 0;

        while(neg < post && arr[neg] < 0) {

            temp = arr[post];
            arr[post] = arr[neg];
            arr[neg] = temp;
            post++;
            neg += 2;

        }
    }

}
