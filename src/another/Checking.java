package another;

public class Checking {

    public static void main(String[] args) {
        String val = "12041998";

        int data = Integer.parseInt(val) / 10000 % 10;

        System.out.println(data);
    }
}
