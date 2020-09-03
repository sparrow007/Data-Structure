package CP.CodeForces;

import java.util.Scanner;

public class StringTask {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String task = scanner.nextLine();
        scanner.close();
        task = task.toLowerCase();

        task = task.replaceAll("[aoyeui]", "").replaceAll("[a-z]", ".$0");

        System.out.println(task);
    }
}
