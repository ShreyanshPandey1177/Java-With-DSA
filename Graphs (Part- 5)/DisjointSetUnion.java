
public class DisjointSetUnion {

    static int n = 7;
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

    public static void main(String[] args) {
        init();
        union(1, 3);
        System.out.println(find(3));
        union(1, 3);
        System.out.println(Find(3));
        union(2, 4);
        union(3, 6);
        union(1, 4);
        System.err.println(find(3));
        System.out.println(Find(4));
        union(1, 5);
    }
}
  //3,1,1,1,1 solution
