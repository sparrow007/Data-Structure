package programs.Recursions;

import java.util.Scanner;

public class ConstantsCount {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        //System.out.println(consonantsLength(s.toCharArray(), 0));
        System.out.println(count(s));

    }

    public static int consonantsLength(char arr[], int index)  {
        if(arr.length == index)
            return 0;

        if(arr[index] == ' ' || arr[index] == 'a' || arr[index] == 'e' || arr[index] == 'i' ||arr[index] == 'o'|| arr[index] == 'u'){
            return  consonantsLength(arr,++index);
        }else
            return 1 + consonantsLength(arr,++index);

    }

    public static int count(String s){

        if(s.equals(""))
            return 0;

        if(s.charAt(0)=='a'||s.charAt(0)=='e'||s.charAt(0)=='i'||s.charAt(0)=='o'||s.charAt(0)=='u'||s.charAt(0)==' ')
            return count(s.substring(1));
        else
            return 1+count(s.substring(1));

    }
}
