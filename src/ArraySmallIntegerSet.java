public class ArraySmallIntegerSet implements SmallIntegerSet {

    private boolean[] data;

    public ArraySmallIntegerSet(int capacity) {
        data = new boolean[capacity];
    }

    @Override
    public void add(int n) {
        data[n] = true;
    }

    @Override
    public boolean contains(int n) {
        return data[n];
    }

    @Override
    public void remove(int n) {
        data[n] = false;
    }
}
