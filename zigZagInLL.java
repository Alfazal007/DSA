import java.util.LinkedList;

public class zigZagInLL {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null, tail = null;
    static int size = 0;

    public static void addLast(int data) {
        Node temp = new Node(data);
        if (size == 0) {
            head = temp;
            tail = temp;
            size++;
            return;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }

    public static void zigzagger() {
        if (size == 0 || size == 1 || size == 2) {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
            return;
        }
        LinkedList<Integer> ll = new LinkedList<>();
        Node temp = head;
        Node mid = null;
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        mid = slow;
        Node prev = null;
        Node cur = mid;
        Node next = cur.next;
        while (next != null) {
            cur.next = prev;
            prev = cur;
            cur = next;
            next = next.next;
        }
        cur.next = prev;
        Node head2 = cur;
        while (head2 != null && head != head2) {
            ll.addLast(head.data);
            ll.addLast(head2.data);
            head = head.next;
            head2 = head2.next;
        }
        if (head == head2 && head2 != null) {
            ll.addLast(head.data);
        }
        System.out.println(ll);
    }

    public static void main(String[] args) {
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);
        zigzagger();
    }
}
