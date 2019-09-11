import edu.princeton.cs.algs4.ResizingArrayQueue;
import edu.princeton.cs.algs4.ResizingArrayStack;

public class BinaryNode {

    private int item;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int item) {
        this.item = item;
    }

    public BinaryNode(int item, BinaryNode left, BinaryNode right) {
        this.item = item;
        this.left = left;
        this.right = right;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    public static void traverseBreadthFirst(BinaryNode root) {
        ResizingArrayQueue<BinaryNode> q = new ResizingArrayQueue<>();
        q.enqueue(root);
        while (!q.isEmpty()) {
            BinaryNode n = q.dequeue();
            StdOut.println(n.getItem());
            if (n.getLeft() != null) {
                q.enqueue(n.getLeft());
            }
            if (n.getRight() != null) {
                q.enqueue(n.getRight());
            }
        }
    }

    public static void traverseDepthFirst(BinaryNode root) {
        ResizingArrayStack<BinaryNode> q = new ResizingArrayStack<>();
        q.push(root);
        while (!q.isEmpty()) {
            BinaryNode n = q.pop();
            StdOut.println(n.getItem());
            if (n.getRight() != null) {
                q.push(n.getRight());
            }
            if (n.getLeft() != null) {
                q.push(n.getLeft());
            }
        }
    }

    public static void traversePreorder(BinaryNode root) {
        if (root != null) {
            StdOut.println(root.getItem());
            traversePreorder(root.getLeft());
            traversePreorder(root.getRight());
        }
    }

    public static void traverseInorder(BinaryNode root) {
        if (root != null) {
            traverseInorder(root.getLeft());
            StdOut.println(root.getItem());
            traverseInorder(root.getRight());
        }
    }
    public static void main(String[] args) {
        BinaryNode two = new BinaryNode(2);
        BinaryNode five = new BinaryNode(5);
        BinaryNode three = new BinaryNode(3, two, five);
        BinaryNode six = new BinaryNode(6);
        BinaryNode one = new BinaryNode(1, null, six);
        BinaryNode four = new BinaryNode(4, three, one);
        five.setRight(new BinaryNode(7));
        traverseInorder(four);
    }

}
