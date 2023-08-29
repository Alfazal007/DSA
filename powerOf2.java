import java.util.Scanner;

public class powerOf2 {
    public static int checker(int n) {
        return n & n - 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int res = checker(n);
        if (res == 0) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
    }
}
