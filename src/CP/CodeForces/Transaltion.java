package CP.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class Transaltion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String lang = scanner.nextLine();
        String trans = scanner.nextLine();

        int start = 0;
        int end = trans.length()-1;
        boolean isTransalte = true;
        for (int i = 0; i < trans.length(); i++, start++, end--) {

            if(lang.charAt(start) != trans.charAt(end)) {
                isTransalte = false;
                break;
            }

        }

        if(isTransalte) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }


    }
}
