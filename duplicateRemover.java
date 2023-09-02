import java.util.Scanner;

public class duplicateRemover {
    public static String removeDup(String str, boolean charArr[]) {
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < str.length(); i++) {
            if (charArr[(int) (str.charAt(i) - 'a')] == false) {
                charArr[(int) (str.charAt(i) - 'a')] = true;
                stringBuilder.append(str.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        boolean charArr[] = new boolean[26];
        String newStr = removeDup(str, charArr);
        System.out.println(newStr);
    }
}
