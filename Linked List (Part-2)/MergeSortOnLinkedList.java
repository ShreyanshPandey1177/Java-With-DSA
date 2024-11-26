
import java.util.LinkedList;

public class MergeSortOnLinkedList {

    private node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; //mid node
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node Temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                Temp.next = head1;
                head1 = head1.next;
                temp = Temp.next;

            } else {
                Temp.next = head2;
                head2 = head2.next;
                temp = Temp.next;
            }
        }
        while (head1 != null) {
            Temp.next = head1;
            head1 = head1.next;
            temp = Temp.next;
        }
        while (head2 != null) {
            Temp.next = head1;
            head1 = head1.next;
            temp = Temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        //find mid
        Node mid = getMid();

        //left& right merge sort
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        //merge
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);

        ll.print();
        ll.head = ll.mergeSort(ll.head);
        ll.print();

    }
}
