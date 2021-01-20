package kotlinLearning.generics;


public class GenA<T> {

    private T t;

    public GenA (T t) {
        this.t = t;
    }

    public T getValue () {
        return t;
    }
}


