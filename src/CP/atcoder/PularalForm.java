package CP.atcoder;

import java.util.Scanner;

public class PularalForm {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        if(input.charAt(input.length() - 1) != 's') System.out.println(input + "s");
        else System.out.println(input + "es");

    }
}