package CP.CF.Div;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int test = scanner.nextInt();

        while (test-->0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            if(a==b) {
                System.out.println(2*a);
            }else if(a < b) {
                System.out.println(2*b - 1);
            }else {
                System.out.println(2*a - 1);
            }
        }
    }
}
