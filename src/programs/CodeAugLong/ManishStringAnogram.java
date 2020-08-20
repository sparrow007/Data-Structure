package programs.CodeAugLong;

import java.util.Arrays;
import java.util.Scanner;

public class ManishStringAnogram {


    public static void main (String[] args) throws java.lang.Exception
    {
        int t=0;
        String s="";
        String p="";
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
            t=sc.nextInt();
        if(sc.hasNextLine())
            sc.nextLine();
        while (t>0) {
            if(sc.hasNextLine())
                s = sc.nextLine();
            if(sc.hasNextLine())
                p = sc.nextLine();
            s.trim();
            p.trim();
            solve(s,p);
            t--;
        }
    }
    private static void solve(String s, String p) {
        char[] arr = s.toCharArray();
        char[] sub = p.toCharArray();
        Arrays.sort(sub);
        Arrays.sort(arr);
        int count = 0;
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]);
//        }
//        System.out.println();
        String before = "";
        String after = "";
        String after1="";
        String before1="";

        for (int i = 0; i < s.length(); i++) {
            if (arr[i] == ' ') {
                continue;
            }
            if (count < sub.length && sub[count] == ' ') {
                count++;
                continue;
            }
            if (count < sub.length && arr[i] == sub[count]) {
                count++;
                continue;
            }
            if (arr[i] < p.charAt(0) && arr[i] != ' ') {
                before = before + arr[i];
                before1 = before1 + arr[i];
            }
            if (arr[i] > p.charAt(0) && arr[i] != ' ') {
                after = after + arr[i];
                after1 = after1 + arr[i];
            }
            if (arr[i] == p.charAt(0) && arr[i] != ' ') {
                if (sub[0] < arr[i]) {
                    after = after + arr[i];

                    before1 = before1 + arr[i];
                } else {
                    before = before + arr[i];
                    after1 = after1 + arr[i];
                }
            }
        }
        p = p.replaceAll("\\s", "");
       String ans="";
       String ans1="";
//        System.out.println(before + after);
       ans= before + p + after;
       ans1= before1 + p + after1;
       if(ans.compareTo(ans1)<0)
        System.out.println(ans);
       else
        System.out.println(ans1);
    }
}
