package CP.CodeForces;

import java.util.Scanner;

public class DownAntony {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        scanner.nextLine();

        String games = scanner.nextLine();

        long d = games.chars().filter(c -> c == 'D').count();

        long a = length - d;

        if (d > a)
          System.out.println("Danik");
        else if(a > d)
          System.out.println("Anton");
        else
          System.out.println("Friendship");

    }

}
