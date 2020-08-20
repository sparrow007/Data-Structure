package programs.Recursions.GFG.Manish;

import java.util.Scanner;

public class ManishPattern {

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printseq(n);

    }
    public static void printseq(int n){
        if(n==0){
            System.out.print(n+" ");
            return;
        }
        System.out.print(n+" ");
        if(n>0){
            printseq(n-5);
            System.out.print(" "+n);
        }
    }
}
