import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueues {
    public static Queue<Integer> q1 = new LinkedList<>();
    public static Queue<Integer> q2 = new LinkedList<>();

    public static void add(int item) {
        if (q1.isEmpty() && q1.isEmpty()) {
            q1.add(item);
            return;
        }
        if (q1.isEmpty()) {
            q2.add(item);
        } else {
            q1.add(item);
        }
    }

    public static int remove() {
        if (q1.isEmpty() && q2.isEmpty()) {
            return Integer.MIN_VALUE;
        } else if (q1.isEmpty()) {
            while (q2.size() != 1) {
                q1.add(q2.remove());
            }
            return q2.remove();
        } else {
            while (q1.size() != 1) {
                q2.add(q1.remove());
            }
            return q1.remove();
        }
    }

    public static void main(String[] args) {
        add(0);
        add(1);
        System.out.println(remove());
        System.out.println(remove());
        add(2);
        add(3);
        add(4);
        System.out.println(remove());
        System.out.println(remove());
        System.out.println(remove());
    }
}
