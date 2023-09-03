import java.util.Scanner;

public class towerOfHanoi {
    public static void toh(char src, char temp, char dest, int n) {
        if (n == 0) {
            return;
        }
        toh(src, dest, temp, n - 1);
        System.out.println("Move disc " + n + " from " + src + " to " + dest);
        toh(temp, src, dest, n - 1);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number of discs :");
        int n = new Scanner(System.in).nextInt();
        toh('a', 'b', 'c', n);
    }
}
