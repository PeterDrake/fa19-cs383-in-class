import edu.princeton.cs.algs4.DijkstraSP;
import edu.princeton.cs.algs4.DirectedEdge;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;

/** Rosalind.info problem: shortest cycle in a weighted digraph NOT going through a given edge. */
public class ShortestCycle {

    private DirectedEdge edge;

    public static void main(String[] args) {
        new ShortestCycle().run();
    }

    public void run() {
        In in = new In("rosalind_cte.txt");
        int n = in.readInt(); // Number of graphs
        for (int i = 0; i < n; i++) {
            solve(in);
        }
    }

    /** Reads a weighted digraph from in and prints the solution. */
    public void solve(In in) {
        EdgeWeightedDigraph g = readGraph(in);
        DijkstraSP shortest = new DijkstraSP(g, edge.to());
        double length = shortest.distTo(edge.from());
        if (length == Double.POSITIVE_INFINITY) {
            StdOut.print("-1 ");
        } else {
            StdOut.print((int)(length + edge.weight()) + " ");
        }
    }

    private EdgeWeightedDigraph readGraph(In in) {
        int v = in.readInt();
        int e = in.readInt();
        EdgeWeightedDigraph g = new EdgeWeightedDigraph(v + 1);
        edge = new DirectedEdge(in.readInt(), in.readInt(), in.readInt());
        for (int i = 0; i < e - 1; i++) {
            g.addEdge(new DirectedEdge(in.readInt(), in.readInt(), in.readInt()));
        }
        return g;
    }

}
