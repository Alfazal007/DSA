import java.util.Scanner;

public class findPermutations {
    public static void findPermutation(String str, String cur) {
        if (str.length() == 0) {
            System.out.println(cur);
            return;
        }
        for (int i = 0; i < str.length(); i++) {
            findPermutation(str.substring(0, i) + str.substring(i + 1), cur + str.charAt(i));
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter the string :");
        String str = new Scanner(System.in).next();
        findPermutation(str, "");
    }
}
