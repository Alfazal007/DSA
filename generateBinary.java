import java.util.Scanner;

public class generateBinary {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        int n = new Scanner(System.in).nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println(Integer.toBinaryString(i));
        }
    }
}
