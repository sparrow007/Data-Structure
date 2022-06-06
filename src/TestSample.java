public class TestSample {

    public static void main(String[] args) {

        char ch = '5';
        int a = Integer.parseInt(ch+"");
        String str = "a";

        System.out.println(charRemoveAt(str, 0));
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

}
