package LeetCode.String;

public class ReverseCharacter {

    public static void main(String[] args) {
        String name = "a-bC-dEf-ghIj";

       reverseChar(name);
    }

    static void reverseChar(String input) {

        char[] first = new char[input.length()];

        char[] out = new char[input.length()];

        for (int i= 0, j = input.length(); i < input.length() ; i++, j--) {

            if(!Character.isLetter(input.charAt(i))) out[i] = input.charAt(i);
            else out[i] = 'a';

        }

        for (int i = input.length()-1, j = 0; j < input.length() && i >= 0; j++) {

            if(!Character.isLetter(input.charAt(i))) {
                j--;
                i--;
                continue;
            }

            if(Character.isLetter(out[j])){
                out[j] = input.charAt(i);
                i--;
            }

        }

        System.out.println(String.valueOf(out));

    }

    static void reverse(String name) {


        int first = 0;
        int last = name.length()-1;

        while (first < last) {
            if (Character.isLetter(name.charAt(first)) && Character.isLetter(last)) {
                char temp = name.charAt(first);
            }
        }

    }
}
