import java.util.Scanner;

public class clearLastIBits {
    public static int clearLastBits(int n, int i) {
        // -1 is equivalent to 111111111....
        int bitMask = -1 << i;
        return bitMask & n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Enter the value of i: ");
        int i = sc.nextInt();
        int res = clearLastBits(n, i);
        System.out.println(res);
    }
}
