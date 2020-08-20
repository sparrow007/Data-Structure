package programs.Recursions;

import java.util.Scanner;

public class StringLength {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        System.out.println(count(s, 0));
    }

    public static int count(String s, int index) {

     try {
         s.charAt(index);
        return 1  + count(s, index + 1);
     }catch (Exception e) {
         return 0;
     }

    }

    public static int count(String s){
        if(s.equals("")){
            return 0;
        }
        return 1 + count(s.substring(1));
    }
}
