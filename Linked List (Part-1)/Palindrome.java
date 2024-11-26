
import com.sun.security.auth.module.LdapLoginModule;
import java.util.*;

public class Palindrome {

    public IntroLinkedList.Node findMid(IntroLinkedList.Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next; //+1
            fast = fast.next.next; //+2 
        }
        return slow;  //slow is my mid node
    }

    public boolean checkPalindrome() {
        if (head == null || head.next != null) {
            return true;
        }
        //step1-find mid
        Node midNode = findMid(head);

        //step2-reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            curr.next = prev;
            prev = curr;
            curr = next;

        }
        Node right = prev //right half head
        Node left = head;

        //step3- check left half &right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(2);
        ll.addLast(1);
        ll.print();
        System.out.println(ll.checkPalindrome());
    }
}
