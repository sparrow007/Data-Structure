package CP.CodeForces.EducationDiv2;

import java.util.Scanner;

public class AProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.nextLine();

       while(n-->0) {
           String s = scanner.nextLine();

           System.out.println(s.length());
       }
    }
}
