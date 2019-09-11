public class LinkedList {

    class Node {
        int item;
        Node next;

        public Node(int item, Node next) {
            this.item = item;
            this.next = next;
        }
    }

    private Node front;

    public void addFront(int item) {
//        Node n = new Node();
//        n.item = item;
//        n.next = front;
//        front = n;
        front = new Node(item, front);
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addFront(1);
        list.addFront(2);
        list.addFront(3);

        for (Node n = list.front; n != null; n = n.next) {
            StdOut.println(n.item);
        }
    }

}
