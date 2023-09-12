import java.util.Stack;

public class pushBottom {
    public static void printStack() {
        if (stack.size() == 1) {
            System.out.print(stack.peek() + " ");
            return;
        }

        int item = stack.pop();
        System.out.print(item + " ");
        printStack();
        stack.push(item);
    }

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

    public static void main(String[] args) {
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        printStack();
        System.out.println();
        pushBottom(0);
        printStack();
        System.out.println();
    }
}
