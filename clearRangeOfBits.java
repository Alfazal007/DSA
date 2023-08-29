import java.util.Scanner;

public class clearRangeOfBits {
    public static int clearRangeBits(int n, int i, int j) {
        // to create bit mask
        int b1 = (-1) << i + 1;
        int b2 = (int) Math.pow(2, j) - 1;
        int bitmask = b1 | b2;
        return bitmask & n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of i: ");
        int i = sc.nextInt();
        System.out.println("Enter the value of j: ");
        int j = sc.nextInt();
        int res = clearRangeBits(n, i, j);
        System.out.println(res);
    }
}
