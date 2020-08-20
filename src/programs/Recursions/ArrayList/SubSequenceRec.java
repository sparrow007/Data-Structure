package programs.Recursions.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceRec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        System.out.println(getss(input));

    }

    public static ArrayList<String> getss(String input) {

        if(input.length() == 0) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add("");
            return arrayList;
        }

        char firstChar = input.charAt(0);
        ArrayList<String> result = getss(input.substring(1));
        ArrayList<String> os = new ArrayList<>();

        for(String s1 : result) {
            os.add(""+ s1);
        }

        for(String data : result) {
            os.add(firstChar+data);
        }
        return os;
    }
}
