package CP.CodeForces.Small1500;

import java.util.HashMap;
import java.util.Scanner;

public class RegistrationSystem {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();

        scanner.nextLine();

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < length; i++) {
           String namesDB = scanner.nextLine();
            if (hashMap.containsKey(namesDB)) {
                int num =  hashMap.get(namesDB) + 1;
                hashMap.put(namesDB, num);
                System.out.println(namesDB+ num);
            }else {
                hashMap.put(namesDB, 0);
                System.out.println("OK");
            }
        }

    }

}
