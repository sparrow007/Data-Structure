package programs.Extraa;

import java.util.Arrays;
import java.util.Scanner;

public class PatternString {

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
            if (arr[i] < p.charAt(0)) {
                before = before + arr[i];
            }
            if (arr[i] > p.charAt(0)) {
                after = after + arr[i];
            }
            if (arr[i] == p.charAt(0)) {
                if (sub[0] < arr[i]) {
                    after = after + arr[i];
                } else {
                    before = before + arr[i];
                }
            }
        }
        p = p.replaceAll("\\s", "");
//        System.out.println(before + after);
        System.out.println(before + p + after);
    }
}
