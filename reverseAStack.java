import java.util.Stack;

public class reverseAStack {
    public static Stack<Integer> stack = new Stack<>();

    public static void pushBottom(int item) {
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        int cur = stack.pop();
        pushBottom(item);
        stack.push(cur);
    }

    public static void reverser() {
        if (!stack.isEmpty()) {
            int item = stack.pop();
            reverser();
            pushBottom(item);
        }
    }

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println(stack);
        reverser();
        System.out.println(stack);
    }
}
