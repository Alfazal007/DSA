import java.util.Stack;

public class duplicateParenthesis {
    public static boolean isDuplicate(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ')') {
                stack.push(str.charAt(i));
            } else {
                int count = 0;
                while (stack.peek() != '(') {
                    count++;
                    stack.pop();
                }
                stack.pop();
                if (count == 0) {
                    return false;
                }
            }
        }
        if (stack.isEmpty()) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b)+(c+d))";
        System.out.println(isDuplicate(str));
    }
}
