package CP.CodeForces;

import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String  inputMath = scanner.nextLine();


        if(inputMath.length() == 1) System.out.println(inputMath);
        else  {

            String numbers = inputMath.replaceAll("[^0-9]", "");
            char[] num  =  numbers.toCharArray();

            Arrays.sort(num);

           String outMath =  String.valueOf(num).replaceAll("[0-9]", "$0+");
           System.out.println(outMath.substring(0, outMath.length()-1));

        }
    }
}
