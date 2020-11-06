package LeetCode;

import java.util.Scanner;

public class SplitString {

    public static void main(String[] args) {

        String pattern = "RLRRRLLRLL";
        System.out.println(balancedStringSplit(pattern));

    }

    static int balanceSplit(String s) {
        int split = 0;

        int leftCount = 0;
        int rightCount = 0;

        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i) == 'L') {
                leftCount++;
            }else {
                rightCount++;
            }

            if(leftCount == rightCount) {
                split++;
                leftCount = 0;
                rightCount = 0;
            }

        }
        return split;
    }


    static int balancedStringSplit(String s) {
        int count=0;
      //  char first=s.charAt(0);
        int number=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
//          System.out.println(count);

            if(count==0){
                number++;
            }
            if(ch=='R'){
                count++;
            }else {
                count--;
            }

        }
        return number;
    }
}
