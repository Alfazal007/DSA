import java.util.Scanner;

public class countSetBits {
    public static int counter(int n) {
        int count = 0;
        while (n != 0) {
            int temp = n & 1;
            if (temp == 1) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println(counter(n));
    }
}
