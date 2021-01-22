package kotlinLearning.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GenB {

    static <T extends Number> void pass (GenA<T> s) {
        System.out.println(s.getValue() + "");
    }

    public static void main(String[] args) {
        pass(new GenA<>(5));

    }

}
