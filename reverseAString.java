import java.util.Scanner;
import java.util.Stack;

public class reverseAString {
    public static Stack<Character> stack = new Stack<>();

    public static void main(String[] args) {
        System.out.println("Enter the string");
        String str = new Scanner(System.in).next();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (!stack.isEmpty()) {
            stringBuilder.append(stack.pop());
        }
        System.out.println(stringBuilder.toString());
    }
}
