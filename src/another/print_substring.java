package another;

import java.util.Scanner;
import java.util.Stack;

public class print_substring {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        prin_sub(str,"");
    }
    public static void prin_sub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch=str.charAt(0);
        String ros=str.substring(1);
        prin_sub(ros,ans+"");
        prin_sub(ros,ans+ch);

        Stack<Integer> st = new Stack<>();

       

    }
}
