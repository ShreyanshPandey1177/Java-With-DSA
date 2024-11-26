
import com.sun.jdi.PathSearchingVirtualMachine;
import java.util.LinkedList;

public class SearchRecursively {

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String args[]) {
        LinkedList ll = new LinkedList();    //ye hum head aur tail bnana ka liya likhta hai 

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);
        ll.print();
        System.out.println(ll.recSearch(3));

    }

}
