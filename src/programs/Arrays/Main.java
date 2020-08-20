package programs.Arrays;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        // taking input
        for (int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int arr1[]=new int[n];
        // inverse
        for (int i=0;i<n;i++){
            arr1[arr[i]]=i;
        }
        // output
        for (int i=0;i<n;i++){
            System.out.println(arr1[i]);
        }

    }


}
