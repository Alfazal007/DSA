import java.util.LinkedList;
import java.util.Queue;

public class firstNonRepeating {
    public static void handler(String str) {
        int arr[] = new int[26];
        Queue<Character> queue = new LinkedList<>();
        // 'character' - 'a'
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            arr[ch - 'a']++;
            queue.add(ch);
        }
        while (!queue.isEmpty()) {
            char ch = queue.remove();
            if (arr[ch - 'a'] == 1) {
                System.out.println(ch);
                return;
            }
        }
        System.out.println("No character");
    }

    public static void main(String[] args) {
        String str = "aabccxb";
        handler(str);
    }
}
