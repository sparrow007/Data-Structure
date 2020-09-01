package programs.Extraa;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Calendar {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        float month = scanner.nextFloat();

        Locale indiaLocale = new Locale("en", "IND");


        NumberFormat usa  = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat china  = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france  = NumberFormat.getCurrencyInstance(Locale.FRANCE);


        System.out.println("India: " + india.format(month));




    }
}
