package another;

import java.util.ArrayList;
import java.util.Scanner;

public class SubSequenceRev {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String exp = scanner.nextLine();

        ArrayList<String> out = getSS(exp, exp);

        System.out.println(out);

    }

    static ArrayList<String> getSS(String exp, String realExp) {

        if(exp.length() == 0) {
           ArrayList<String> io =  new ArrayList<>();
           io.add("");
           return io;
        }

        char ch = exp.charAt(0);

        ArrayList<String> ss = getSS(exp.substring(1), realExp);

        ArrayList<String> out = new ArrayList<>();

        for (String data : ss) {
            out.add(data);
            out.add(ch+data);
        }

        return out;
    }

}
