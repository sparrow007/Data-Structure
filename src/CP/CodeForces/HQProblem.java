package CP.CodeForces;

import java.util.Scanner;

public class HQProblem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String instruct = scanner.nextLine();

        if(instruct.contains("H") || instruct.contains("Q") || instruct.contains("9")) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
    }
}
