import java.util.Scanner;

public class subsetsOfString {
    public static void subsets(String str, String cur, int idx) {
        if (idx == str.length()) {
            System.out.println(cur);
            return;
        }
        subsets(str, cur + str.charAt(idx), idx + 1);
        subsets(str, cur, idx + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string :");
        String str = new Scanner(System.in).next();
        subsets(str, "", 0);
    }
}
