package kotlinLearning.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenB {

    static <T> void pass (GenA<T> s) {
        System.out.println(s.getValue() + "");
    }

    public static void main(String[] args) {
        pass(new GenA<>(20));

        Integer[] ar = new Integer[9];
        Number[] arr = new Number[1];
        arr = ar;

        List<Number> list = new ArrayList<>();
        List<? extends Integer> l = new ArrayList<>();
        l.clear();

        Stack<Number> stack = new Stack<>();

    }

}
