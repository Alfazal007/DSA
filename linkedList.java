public class linkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void addFirst(int data) {
        size++;
        Node temp = new Node(data);
        // 0 nodes
        if (head == null) {
            head = temp;
            tail = head;
            return;
        }
        temp.next = head;
        head = temp;
    }

    public static void addLast(int data) {
        size++;
        Node temp = new Node(data);
        // 0 nodes
        if (head == null) {
            head = temp;
            tail = head;
            return;
        }
        Node next = head.next;
        Node cur = head;
        while (next != null) {
            cur = next;
            next = next.next;
        }
        cur.next = temp;
    }

    public static void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node temp = new Node(data);
        int i = 0;
        Node prev = head;
        while (i != index - 1) {
            prev = prev.next;
            i++;
        }
        temp.next = prev.next;
        prev.next = temp;
        size++;
    }

    public static void printLL() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    static Node head = null;
    static Node tail = null;
    static int size = 0;

    public static void main(String[] args) {
        addLast(0);
        addLast(1);
        addLast(2);
        addLast(3);
        addLast(4);
        addLast(5);
        addLast(6);
        addLast(7);
        addMiddle(0, 8);
        printLL();
    }
}
