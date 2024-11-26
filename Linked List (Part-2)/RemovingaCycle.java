
import java.util.*;
import java.util.LinkedList;
import org.w3c.dom.Node;

public class RemovingaCycle {

    public static void removeCycle() {
        //detect cycle
        Node slow = head;
        Node fast = head;
        boolean cycle = 0;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next;
            if (fast == slow) {
                cycle = true;
                break;
            }
        }
        if (cycle == false) {
            return;
        }
        //find meeting point 
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        //remove cycle-> last.next =null
        prev.next = null;

    }

    public static void main(String[] args) {
        head = new Node(1);
        head.next = temp;
        Node temp = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = temp;
        removeCycle();
        System.out.println(removeCycle());
    }
}
