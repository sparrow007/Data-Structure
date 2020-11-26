package CP.CF.Div;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.Scanner;

public class SubStringValues {

    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine();
        String input = scanner.nextLine();
        String subString = scanner.nextLine();

        if(!input.contains(subString)){
            System.out.println(0);
            return;
        }

        int totalSubString = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                System.out.print(input.substring(i, j + 1) + " ");
                count++;

                if (input.substring(i, j + 1).contains(subString)) totalSubString++;
            }
        }


        System.out.println(totalSubString);
        System.out.println(count);
    }
}