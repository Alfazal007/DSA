import java.util.Arrays;

public class anagram {
    public static boolean anagramfinder(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();
        char s1str[] = s1.toCharArray();
        char s2str[] = s2.toCharArray();
        Arrays.sort(s1str);
        Arrays.sort(s2str);
        for (int i = 0; i < s1str.length; i++) {
            if (s1str[i] != s2str[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s1 = "earth";
        String s2 = "heart";
        System.out.println(anagramfinder(s1, s2));
    }
}
