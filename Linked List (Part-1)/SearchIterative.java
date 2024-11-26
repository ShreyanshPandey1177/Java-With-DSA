
import java.util.LinkedList;

public class SearchIterative {

    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        //key not found
        return -1;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ye hum head aur tail bnana ka liya likhta hai 

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);

        ll.add(2, 3);

        System.out.println(ll.itrSearch(2));
    }
}
