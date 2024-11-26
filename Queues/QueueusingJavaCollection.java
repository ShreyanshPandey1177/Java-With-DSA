
import java.util.LinkedList;
import java.util.Queue;

public class QueueusingJavaCollection {

    public static void main(String[] args) {
        // Queue q = new Queue();
        Queue<Integer> q = new LinkedList<>();
        //  Queue<integer>q= new ArrayDeque<>(); // ya isko bhi use kar sakta hai
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
