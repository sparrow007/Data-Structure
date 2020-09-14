package programs.Strings;

import java.util.Scanner;

public class PostfixSuffixLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();

        int length = string.length() / 2;
        

        for (int i = length; i >= 0; i--) {

            String firstPhase = string.substring(0, i);

            String secondPhase = string.substring(string.length()-i);


            if (firstPhase.equals(secondPhase)) {
                System.out.println(i);
                break;
            }

        }
    }
}
