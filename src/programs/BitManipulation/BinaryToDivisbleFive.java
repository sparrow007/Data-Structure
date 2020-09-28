package programs.BitManipulation;

public class BinaryToDivisbleFive {

    public static int getFourBase(String bin) {

        if(bin.compareTo("00") == 0) {
           return 0;
        }else if(bin.compareTo("01") == 0) {
            return 1;

        }else if(bin.compareTo("10") == 0) {
            return 2;

        }

        return 3;

    }

    static void isDivisible(String bin) {

        if(bin.length() % 2 != 0)
            bin = "0" + bin;

        int odd_sum = 0;
        int even_sum = 0;

        int isOddDigit = 0;

        for (int i = 0; i < bin.length(); i += 2) {

            if (isOddDigit != 0) {
                odd_sum += getFourBase(bin.substring(i, i + 2));
            } else {
                even_sum += getFourBase(bin.substring(i, i + 2));
            }

            isOddDigit ^= 1;

        }

        if(Math.abs(odd_sum - even_sum) % 10 == 0) {
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }


    public static void main(String[] args) {
        String bin = "11000111001110";
        isDivisible(bin);
    }
}
