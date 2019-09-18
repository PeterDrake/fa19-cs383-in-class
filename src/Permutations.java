import java.util.ArrayList;
import java.util.List;

public class Permutations {

    static List<List<Integer>> allPermutations(int n) {
        List<List<Integer>> result = new ArrayList<>();
        if (n == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> subresult = allPermutations(n - 1);
        for (List<Integer> subsub : subresult) {
            for (int i = 0; i < n; i++) {
                List<Integer> copy = new ArrayList<Integer>(subsub);
                copy.add(i, n - 1);
                result.add(copy);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        StdOut.println(allPermutations(4));
    }

}
