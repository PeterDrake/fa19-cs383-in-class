import edu.princeton.cs.algs4.ResizingArrayQueue;

import java.util.ArrayList;

public class Graph {

    private ArrayList<Integer>[] neighbors;

    public Graph(int capacity) {
        neighbors = (ArrayList<Integer>[])new ArrayList[capacity];
        for (int i = 0; i < capacity; i++) {
            neighbors[i] = new ArrayList<Integer>();
        }
    }

    public void addEdge(int i, int j) {
        neighbors[i].add(j);
        neighbors[j].add(i);
    }

    public void traverseBreadthFirst(int start) {
        ResizingArrayQueue<Integer> q = new ResizingArrayQueue<>();
        boolean[] visited = new boolean[neighbors.length];
        q.enqueue(start);
        visited[start] = true;
        while (!q.isEmpty()) {
            int n = q.dequeue();
            StdOut.println(n);
            for (int neighbor : neighbors[n]) {
                if (!visited[neighbor]) {
                    q.enqueue(neighbor);
                    visited[neighbor] = true;
                }
            }
        }
    }

    public void traverseDepthFirst(int start) {
        traverseDepthFirst(start, new boolean[neighbors.length]);
    }

    private void traverseDepthFirst(int start, boolean[] visited) {
        if (!visited[start]) {
            visited[start] = true;
            StdOut.println(start);
            for (int neighbor : neighbors[start]) {
                if (!visited[neighbor]) {
                    traverseDepthFirst(neighbor, visited);
                }
            }
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(7);
        int[][] pairs = {{0, 2}, {0, 6},
                {1, 3}, //{1, 4}, {1, 5},
                {1, 6},
                {2, 3},
                {3, 5},
                {4, 5}};
        for (int[] pair : pairs) {
            g.addEdge(pair[0], pair[1]);
        }
        g.traverseDepthFirst(3);
    }
}
