package programs.GenericTree;

import java.util.Iterator;

public class GenericTreeRunner implements Iterable<Integer> {
    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    class GenericTreeIterator implements  Iterator<Integer> {

        Integer value;


        @Override
        public boolean hasNext() {
            return value != null;
        }

        @Override
        public Integer next() {
            return null;
        }
    }

    private class Pair {

    }
}
