import java.util.ArrayList;
import java.util.Scanner;

public class contiguousSubstrings {
    public static void contsubstrFinder(String str, int count) {
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        System.out.println("Enter the string :");
        String str = new Scanner(System.in).next();
        contsubstrFinder(str, 0);
    }
}
