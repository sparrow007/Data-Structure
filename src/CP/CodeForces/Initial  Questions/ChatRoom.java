package CP.CodeForces;

import java.util.Scanner;

public class ChatRoom {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        char[] roomWord = input.toCharArray();
        char[] requiredWord = new char[roomWord.length];
        int two = 0;
        for (int i = 0; i < roomWord.length -1; i++) {
            if(two < 1 && roomWord[i] == 'l') {
                requiredWord[i] = roomWord[i];
                two++;
            }else if(roomWord[i] != roomWord[i+1]) {
                requiredWord[i] = roomWord[i];
            }

        }

        requiredWord[requiredWord.length - 1] = roomWord[roomWord.length-1];
        String hello = "hello";
        String finalWord = String.valueOf(requiredWord).replaceAll("\\s", "");
        int forwardInput = 0;
        for (int i = 0; i < finalWord.length(); i++) {
             char ch = finalWord.charAt(i);

             if(hello.charAt(forwardInput) == ch) {
                 System.out.println(forwardInput);
                 forwardInput++;

             }else{
                 forwardInput = 0;
             }
        }

        System.out.println(forwardInput);
        System.out.println(finalWord.length());

    }
}
