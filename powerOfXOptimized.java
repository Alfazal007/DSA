import java.util.Scanner;

public class powerOfXOptimized {
    public static int recursion(int x, int n) {
        if (n == 0) {
            return 1;
        }
        int halfSquared = recursion(x, n / 2);
        halfSquared = halfSquared * halfSquared;
        if (n % 2 == 1) {
            return halfSquared * x;
        }
        return halfSquared;
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
