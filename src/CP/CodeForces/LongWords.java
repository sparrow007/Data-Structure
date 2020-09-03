package CP.CodeForces;

import java.util.Scanner;

public class LongWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int test = scanner.nextInt();

        scanner.nextLine();
        while (test >= 0) {

            String word = scanner.nextLine();
            if(word.length() > 10) {
                char firstCharacter = word.charAt(0);
                char lastCharacter = word.charAt(word.length()-1);
                int length = word.length() - 2;
                String updateWord = firstCharacter + String.valueOf(length) + lastCharacter;
                System.out.println(updateWord);

            }else {
                System.out.println(word);
            }
            test--;
        }


    }
}
