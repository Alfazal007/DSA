import java.util.Scanner;

public class convertNumTOLetter {
    static String equivalent[] = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };

    public static void converter(String num, String str, int cur) {
        if (cur >= num.length()) {
            System.out.println(str.trim());
            return;
        }
        converter(num, str + " " + equivalent[(int) num.charAt(cur) - (int) '0'], cur + 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number :");
        String num = new Scanner(System.in).next();
        if (num.charAt(num.length() - 1) == '0') {
            System.out.println("Not valid");
        } else {
            converter(num, "", 0);
        }
    }
}
