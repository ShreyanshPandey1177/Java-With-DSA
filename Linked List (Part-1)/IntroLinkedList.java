
import java.util.LinkedList;

public class IntroLinkedList {
//intro part 

    public static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //head and tail
    public static Node head;
    public static Node tail;
    public static int size;

    // methods  // iska use hum head and tail ka liya karta hai
    public void addFirst(int data) {
        //step 1 =create new node            //add first in ll
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        //step 2: newNode =head value
        newNode.next = head; // link one node with another

        //step 3 : head=newNode
        head = newNode;

    }

    public void addLast(int data) {

        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        // if (head == null) {
        //     System.out.println("ll is empty");
        // }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    //add in the middle of ll
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        //i=idx-1; temp->prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {      //RemoveFirst element
        if (size == 0) {
            System.out.println("ll is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;

    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //previous node: i=size-2
        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;  //tail data
        prev.next = null;
        tail = prev;
        size--;

    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();    //ye hum head aur tail bnana ka liya likhta hai 

        ll.addFirst(2);

        ll.addFirst(1);

        ll.addLast(4);

        ll.addLast(5);
        ll.add(2, 9);
        System.out.println(ll.size());
        ll.removeFirst();
        ll.removeLast();
        ll.print();
        System.out.println(ll.size());

    }
}
