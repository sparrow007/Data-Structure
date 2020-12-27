package HackerEarth;

import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class FactorsDivisors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int cont = 0;

        System.out.println(Math.sqrt(length));

        for (int i = 1;  i <= Math.sqrt(length); i++) {
            if (length % i == 0) {
                if (length/i == i) {
                   cont++;
                    System.out.println(i);
                }else {
                    cont += 2;
                    System.out.println(i + "  " + length / i);
                }
            }
        }

        System.out.println(cont);
    }
}
