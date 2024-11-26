
import java.util.*;

public class KruskalAlgorithm {

    public class Edge implements Comparable<Edge> {

        int src;
        int cost;
        int wt;

        public Edge(int s, int c, int w) {
            this.src = s;
            this.cost = c;
            this.wt = w;
        }

        @Override
        public int CompareTo(Edge e2) {
            return this.cost - e2.cost; //ascending order 
        }
    }

    static void createGraph(ArrayList<Edge> edges) {
        //edge
        edge.add(new Edge(0, 1, 10));
        edge.add(new Edge(0, 2, 15));
        edge.add(new Edge(0, 3, 30));
        edge.add(new Edge(1, 3, 40));
        edge.add(new Edge(2, 3, 50));
    }

    static int n = 7;  //vertices
    int par[] = new int[n];
    int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
    }

    public static int Find(intx) {
        if (x == par[x]) {
            return x;
        }
        return find(par[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            par[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            par[parA] = parB;
        } else {
            par[parB] = parA;
        }
    }

    public static void kruskalMST(ArrayList<Edge> edges, int V) {
        init();
        Collection.sort(edges);
        int mstCost = 0;
        int count = 0;

        for (int i = 0; count < V - 1; i++) {
            Edge e = edges.get(i);
            //src,dest,wt
            int parA = find(e.src); //src =a;
            int parB = Find(e.dest); //dest=b;
            if (parA != parB) {
                union(e.src, e.dest);
                mstCost += e.wt;
                count++;
            }
        }
        System.out.println(mstCost);
    }

    public static void main(String[] args) {
        int V = 4;
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        kruskalMST(edges, V);
    }
}
