import java.util.Stack;

public class queueThroughStack {
    public static Stack<Integer> s1 = new Stack<>();
    public static Stack<Integer> s2 = new Stack<>();

    public static void push(int item) {
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(item);
        return;
    }

    public static int pop() {
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }
        return s2.pop();
    }

    public static void main(String[] args) {
        push(0);
        push(1);
        push(2);
        System.out.println(pop());
        push(3);
        push(4);
        push(5);
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        System.out.println(pop());
        push(100);
        System.out.println(pop());
    }
}
