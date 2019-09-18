import java.util.ArrayList;
import java.util.List;

public class Subsets {

    /**
     * Returns the ith subset of the nonnegative integers.
     */
    static List<Integer> ithSubset(int i) {
        List<Integer> result = new ArrayList<Integer>();
        for (int j = 1; j <= i; j <<= 1) {
            if ((i & j) != 0) {
                result.add((int)(Math.log(j) / Math.log(2)));
            }
        }
        return result;
    }

    static void printAllSubsets(int n) {
        for (int i = 0; i < (1 << n); i++) {
            StdOut.println(ithSubset(i));
        }
    }

    public static void main(String[] args) {
//        StdOut.println(ithSubset(9));
        printAllSubsets(4);
    }
}
