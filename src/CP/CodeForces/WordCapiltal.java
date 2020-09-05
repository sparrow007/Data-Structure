package CP.CodeForces;

import java.util.Scanner;

public class WordCapiltal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.nextLine();

        char ch = inputWord.charAt(0);
        System.out.println(Character.toUpperCase(ch) + inputWord.substring(1));
    }
}
