import java.util.LinkedList;
import java.util.Queue;

public class interleave2Halves {
    public static Queue<Integer> queue1 = new LinkedList<>();
    public static Queue<Integer> queue2 = new LinkedList<>();
    public static Queue<Integer> queue3 = new LinkedList<>();

    public static void interleave() {
        int cur = queue1.size() / 2;
        for (int i = 0; i < cur; i++) {
            queue2.add(queue1.remove());
        }
        System.out.println(queue2);
        while (queue1.size() != 0) {
            queue3.add(queue2.remove());
            queue3.add(queue1.remove());
        }
        System.out.println(queue3);
    }

    public static void main(String[] args) {
        queue1.add(1);
        queue1.add(2);
        queue1.add(3);
        queue1.add(4);
        queue1.add(5);
        queue1.add(6);
        queue1.add(7);
        queue1.add(8);
        queue1.add(9);
        queue1.add(10);
        interleave();
    }
}
