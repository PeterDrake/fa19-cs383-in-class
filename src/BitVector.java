public class BitVector implements SmallIntegerSet {

    private long[] data;

    public BitVector(int capacity) {
        data = new long[(int)Math.ceil(capacity / 64.0)];
    }

    @Override
    public void add(int n) {
        int word = n / 64;
        data[word] = data[word] | (1L << (n % 64));
    }

    @Override
    public boolean contains(int n) {
        int word = n / 64;
        return (data[word] & (1L << (n % 64))) != 0;
    }

    @Override
    public void remove(int n) {
        int word = n / 64;
        data[word] = data[word] & ~(1L << (n % 64));
    }

}
