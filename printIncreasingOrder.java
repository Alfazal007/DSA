import java.util.Scanner;

public class printIncreasingOrder {
    public static void printIncreasing(int n, int cur) {
        if (n == cur) {
            System.out.print(cur);
            return;
        }
        System.out.print(cur + " ");
        printIncreasing(n, cur + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        printIncreasing(n, 0);
    }
}
