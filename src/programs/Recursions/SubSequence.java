package programs.Recursions;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class SubSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();
        System.out.println(getss(word));

    }

    public static ArrayList<String> getss(String s) {
        if(s.length() == 0) {
            ArrayList<String> ros = new ArrayList<>();
            ros.add("");
            return ros;
        }

        char first = s.charAt(0);
        ArrayList<String> ss = getss(s.substring(1));

        ArrayList<String> ros = new ArrayList<>();

        for(String data : ss) {
            ros.add("" + data);
            ros.add(first + data);
        }

        return ros;

    }
}
