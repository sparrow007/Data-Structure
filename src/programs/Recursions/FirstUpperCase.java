package programs.Recursions;

import java.util.Scanner;

public class FirstUpperCase {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        printFirstUpper(s.toCharArray(), 0);

    }

    public static void printFirstUpper(char[] ch, int index) {
        if(Character.isUpperCase(ch[index])) {
            System.out.println(ch[index]);
            return;
        }

        if(ch.length == index)
            return;

        printFirstUpper(ch, ++index);
    }

}
