package StringExp;

import java.util.Scanner;

public class CheckAnagram {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        String s1 = scanner.nextLine();
        String s2 = scanner.nextLine();

        boolean isAnagram = false;
        boolean[] isVisited = new boolean[s1.length()];

        if(s1.length() == s2.length()) {

            for (int i = 0; i < s1.length(); i++) {
                char ch = s1.charAt(i);
                isAnagram = false;
                for (int j = 0; j < s2.length(); j++) {
                    if (s2.charAt(j) == ch && !isVisited[j]) {
                        isAnagram = true;
                        isVisited[j] = true;
                        break;
                    }
                }
                if(!isAnagram) {
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
