public class ArrayTraversal {

    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

//        for (int i = 0; i < numbers.length; i++) {
//            StdOut.println(numbers[i]);
//        }

//        for (int n : numbers) {
//            StdOut.println(n);
//        }

        for (int i = numbers.length - 1; i >= 0; i--) {
            StdOut.println(numbers[i]);
        }
    }

}
