package another;

import java.util.Arrays;
import java.util.Scanner;

public class BoyGirl {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();


        //You will get the different count;
        username.chars().distinct().count();


        int totalNumber = 0;

        char[] names = username.toCharArray();

        Arrays.sort(names);

        for (int i = 0; i < names.length-1; i++) {

            char curr = names[i];
            char next = names[i+1];

            if(curr != next) {

                totalNumber++;
            }

        }


        totalNumber += 1;

        if(totalNumber % 2 == 0)
            System.out.println("CHAT WITH HER!");
        else
            System.out.println("IGNORE HIM!");
    }
}
