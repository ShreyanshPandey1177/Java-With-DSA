
import java.util.PriorityQueue;

public class NearByCars {

    static class Point implements Comparable<Point> {

        int x;
        int y;
        int distSq;
        int idx;

        public Point(int x, int y, int distSq, int idx) {
            this.x = x;
            this.y = y;
            this.distSq = distSq;
            this.idx = idx;

            @Override

            public int compareTO
            (Point p2
                
            ){
                return this.distSq - p2.distSq;  //ascending order
            }
        }

    }

    public static void main(String[] args) {
        int pts[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2;

        PriorityQueue<java.awt.Point> pq = new PriorityQueue<>();
        for (int i = 0; i < pts.length; i++) {
            int distSq = pts[i][0] * pts[i][0] + pts[i][1] * pts[i][i];
            pq.add(new Point(pts[i][0], pts[i][1], distSq, i));
        }

        //nearest k cars
        for (int i = 0; i < k; i++) {
            System.out.println("c" + pq.remove());
        }

    }
}
