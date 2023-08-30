import java.util.Scanner;

public class printNumsDecreasing {
    public static void printDecreasing(int n) {
        if (n <= 1) {
            System.out.println(n);
            return;
        } else {
            System.out.println(n);
            printDecreasing(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of n: ");
        int n = sc.nextInt();
        printDecreasing(n);
    }
}
