public class ArrayStack<T> implements Stack<T> {
    T[] data;
    int capacity;
    int size;

    public ArrayStack(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            this.data = (T[]) new Object[capacity];
        }
    }

    @Override
    public void push(T val) {
        // O(1) operation
        // insert at the end of the array
        data[size] = val;
        size++;

    }

    @Override
    public T pop() {
        T val = data[size - 1];
        size--;
        // O(1) operation
        return val;
    }

    @Override
    public boolean isEmpty() {
        // O(1) operation
        return size == 0;
    }
}
