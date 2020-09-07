package CP.CodeForces;

import java.util.Scanner;

public class Word {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();

        int countUpperCase = 0;

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if(Character.isUpperCase(ch)) countUpperCase++;
        }

        int lowerCase = word.length() - countUpperCase;

        if(countUpperCase > lowerCase)
            System.out.println(word.toUpperCase());
        else
            System.out.println(word.toLowerCase());
    }
}
