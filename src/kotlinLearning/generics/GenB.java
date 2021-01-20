package kotlinLearning.generics;

public class GenB {

    static <T> void pass (GenA<T> s) {
        System.out.println(s.getValue() + "");
    }

    public static void main(String[] args) {
        pass(new GenA<>(20));
    }

}
