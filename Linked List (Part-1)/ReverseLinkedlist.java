
import java.util.LinkedList;

public class ReverseLinkedlist {

    public void reverse() {
        IntroLinkedList.Node prev = null;
        IntroLinkedList.Node curr = tail = head;
        IntroLinkedList.Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ye hum head aur tail bnana ka liya likhta hai 

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);

        ll.reverse();
        ll.print();
    }
}
