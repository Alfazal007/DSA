import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class queueReversal {
    public static Queue<Integer> queue = new LinkedList<>();
    public static Stack<Integer> stack = new Stack<>();

    public static void reverse() {
        while (queue.size() != 0) {
            stack.push(queue.remove());
        }
        while(!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        System.out.println(queue);
        reverse();
        System.out.println(queue);
    }
}
