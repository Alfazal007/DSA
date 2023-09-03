import java.util.Scanner;

public class lengthOfStringRecursion {
    public static void lengthFinder(String str, int cur) {
        if (str.length() == cur) {
            System.out.println(cur);
            return;
        }
        lengthFinder(str, cur + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string :");
        String str = new Scanner(System.in).next();
        lengthFinder(str, 0);
    }
}
