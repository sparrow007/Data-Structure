package CP.CodeForces;

import java.util.Scanner;

public class PetaStrings {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String firstLetter = scanner.nextLine().toLowerCase();
        String secondLetter = scanner.nextLine();
        int num = firstLetter.compareTo(secondLetter.toLowerCase());
        if(num != 0)
        num = num > 0 ? 1 : -1;
        System.out.println(num);

    }
}
