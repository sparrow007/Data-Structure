package programs.Arrays;

import java.util.Scanner;

public class ExitPointMatrix {

    public static void main(String ars[]) {

        Scanner scanner = new Scanner(System.in);
        int row = scanner.nextInt();
        int column = scanner.nextInt();

        int a[][] = new int[row][column];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        int i = 0;
        int j = 0;
        int d = 0;
        while(true) {

            d = (d + a[i][j]) % 4;

           switch (d) {
               case 0 : j++;
                       break;

               case 1 : i++;
                   break;
               case 2 : j--;
                   break;

               case 3 : i--;
                   break;
           }

           if(i < 0) {
               i++;
               break;
           }else if(j < 0) {
               j++;
               break;
           }else if(j > a[0].length-1){
               j--;
               break;
           }else if(i > a.length-1) {
               i--;
               break;
           }

        }

        System.out.println(i);
        System.out.println(j);

    }
}
