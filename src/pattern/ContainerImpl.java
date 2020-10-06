package pattern;

import java.util.ArrayList;

public class ContainerImpl<T> implements Container<T> {

    private T[] storage;

    public ContainerImpl(T... items) {
        this.storage = items;
    }

    @Override
    public Iterator<T> getIterator() {
        return new MyIterator();
    }

    private class MyIterator implements Iterator<T> {
        private int cursor = 0;

        @Override
        public boolean hasNext() {
            return cursor < storage.length - 1;
        }

        @Override
        public T next() {
            if (hasNext()) {
                T next = storage[cursor];
                cursor++;
                return next;
            }
            throw new RuntimeException("Iterator is Over!");
        }

        @Override
        public void remove() {
          /*  T[] newStorage = new ArrayList<T>().toArray()new T [storage.length - 1];
            for (int i = 0; i < cursor; i++) {
                newStorage[i] = storage[i];
            }
            for (int i = cursor + 1; i < storage.length; i++) {
                newStorage[i - 1] = storage[i];
            }
            storage = newStorage;*/
        }
    }
}
