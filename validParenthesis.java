import java.util.Stack;

public class validParenthesis {
    public static boolean validity(String str) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '{' || str.charAt(i) == '[' || str.charAt(i) == '(') {
                stack.push(str.charAt(i));
            } else if ((stack.peek() == '{' && str.charAt(i) == '}') || (stack.peek() == '[' && str.charAt(i) == ']')
                    || (stack.peek() == '(' && str.charAt(i) == ')')) {
                stack.pop();
            } else {
                return false;
            }
        }
        if(stack.isEmpty()) {
            return true;
        } else  {
            return false;
        }
    }

    public static void main(String[] args) {
        String str = "{([()]){}}";
        System.out.println(validity(str));
    }
}
