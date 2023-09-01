import java.util.Scanner;

public class powerOfXRecursion {
    public static int recursion(int x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * recursion(x, n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number x :");
        int x = sc.nextInt();
        System.out.println("Enter the number n :");
        int n = sc.nextInt();
        System.out.println(recursion(x, n));
    }
}
