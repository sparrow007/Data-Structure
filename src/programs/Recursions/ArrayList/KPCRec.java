package programs.Recursions.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class KPCRec {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input  = scanner.nextLine();
        String[] keys = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

        System.out.println(getKPC(input, keys));

    }

    public static ArrayList<String> getKPC(String input, String[] keys) {

        if(input.length() == 0) {
            ArrayList arrayList = new ArrayList<String>();
            arrayList.add("");
            return arrayList;
        }

        char firstChar = input.charAt(0);
        ArrayList<String> result = getKPC(input.substring(1), keys);
        ArrayList<String> os = new ArrayList<>();

        String keyToAdd =  keys[Character.getNumericValue(firstChar)];
        for(int i = 0; i < keyToAdd.length(); i++) {
            char code = keyToAdd.charAt(i);
            for(String data : result) {
                os.add(code + data);
            }
        }

        return os;

    }


}
