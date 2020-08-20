package StringExp;

import java.util.Scanner;

public class OptCheckAnagram {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();
        boolean isAnagram = false;

        int firstAscii[] = new int[256];

        if(s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                int firstIndex = s1.charAt(i);
                int secondIndex = s2.charAt(i);

                firstAscii[firstIndex] += 1;
                firstAscii[secondIndex] -= 1;
            }
            isAnagram = true;
            for (int i = 0; i < 256; i++) {
                if (firstAscii[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if(isAnagram) {
            System.out.println("Anagram");
        }else {
            System.out.println("Not an anagram");
        }
    }
}