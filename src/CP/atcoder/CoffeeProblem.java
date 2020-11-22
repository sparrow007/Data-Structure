package CP.atcoder;

import java.util.Scanner;

public class CoffeeProblem {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] ch = input.toCharArray();

        if(ch[2]== ch[3] && ch[4] == ch[5]) {
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
