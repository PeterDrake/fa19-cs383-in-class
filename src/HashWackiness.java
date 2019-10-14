public class HashWackiness {

    public static void main(String[] args) {
        int n = 0;
        StdOut.println(makePositive(n));
    }

    static int makePositive(int n) {
        return n & Integer.MAX_VALUE;
    }
}
