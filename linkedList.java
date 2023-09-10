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
        tail = temp;
    }

    public static void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index >= size - 1) {
            addLast(data);
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

    public static int removeFirst() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        } else {
            int data = head.data;
            head = head.next;
            size--;
            return data;
        }
    }

    public static int removeLast() {
        if (size == 0) {
            return Integer.MIN_VALUE;
        }
        if (size == 1) {
            int data = head.data;
            head = null;
            tail = null;
            size--;
            return data;
        } else {
            Node temp = head;
            Node prev = null;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            tail = prev;
            size--;
            return temp.data;
        }
    }

    public static void printLL() {
        if (size == 0) {
            System.out.println("Empty linked list");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static int searchIterative(int key) {
        if (size == 0) {
            return -1;
        }
        Node temp = head;
        System.out.println(temp.data);
        int cur = 0;
        while (temp != null && temp.data != key) {
            temp = temp.next;
            cur++;
        }
        if (temp == null) {
            return -1;
        } else {
            return cur;
        }
    }

    public static int searchRecursive(Node temp, int key, int cur) {
        if (temp == null) {
            return -1;
        }
        if (temp.data == key) {
            return cur;
        } else {
            return searchRecursive(temp.next, key, cur + 1);
        }
    }

    public static void reverse() {
        if (size <= 1) {
            return;
        }
        if (size == 2) {
            tail.next = head;
            head.next = null;
            Node temp = head;
            head = tail;
            tail = temp;
            return;
        }
        Node prev = null;
        Node temp = head;
        Node cur = head.next;
        while (cur != null) {
            temp.next = prev;
            prev = temp;
            temp = cur;
            cur = cur.next;
        }
        temp.next = prev;
        temp = head;
        head = tail;
        tail = temp;
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
        reverse();
        printLL();
    }
}
