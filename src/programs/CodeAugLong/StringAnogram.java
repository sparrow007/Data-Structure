package programs.CodeAugLong;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnogram {

    public static void main(String args[]) {

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
            checkString(s,p);
            t--;
        }

    }

    public static void checkString(String s, String patter) {
        StringBuilder stringBuilder = new StringBuilder(s);

        for(char ch : patter.toCharArray()) {
            int index = s.indexOf(ch);
            stringBuilder.deleteCharAt(index);
            s= stringBuilder.toString();
        }

        String sort = stringBuilder.toString();
        char [] sortChar = sort.toCharArray();
        Arrays.sort(sortChar);
        int position = 0;
        int lastIndex = 0;
        int firstChar = patter.charAt(0);
        for(int i = 0; i < sortChar.length; i++) {
            if(firstChar == sortChar[i]) {
                position = i;
                break;
            }
        }

        for(int i = sortChar.length-1; i >= 0; i--) {
            if(firstChar == sortChar[i]){
                lastIndex = i+1;
                break;
            }
        }

        String data =  String.copyValueOf(sortChar);
        StringBuilder builder = new StringBuilder(data);
        builder.insert(position, patter);

        StringBuilder stringBuilder1 = new StringBuilder(data);
        stringBuilder1.insert(lastIndex, patter);
        String ans = "";

        if(builder.toString().compareTo(stringBuilder1.toString()) < 0) {
            ans = builder.toString();
        }else {
            ans = stringBuilder1.toString();
        }
//
//        System.out.println(stringBuilder);

        System.out.println(ans);
    }

}
