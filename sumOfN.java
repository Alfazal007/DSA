import java.util.Scanner;

public class sumOfN {
    public static int summer(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return n + summer(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        int res = summer(n);
        System.out.println(res);
    }
}
